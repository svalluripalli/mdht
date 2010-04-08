/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added template parameter
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;

/**
 * Abstract base class for model transformations.
 */
public abstract class TransformAbstract extends UMLSwitch<Object> {
	public static final String LF = System.getProperty("line.separator");
	
	public static final String VALIDATION_ERROR = "constraints.validation.error";
	public static final String VALIDATION_WARNING = "constraints.validation.warning";
	public static final String VALIDATION_INFO = "constraints.validation.info";

	public static final String SEVERITY_ERROR = "ERROR";
	public static final String SEVERITY_WARNING = "WARNING";
	public static final String SEVERITY_INFO = "INFO";

	public static final String CDA_PACKAGE_NAME = "cda";

	protected EcoreTransformerOptions transformerOptions;

	public TransformAbstract(EcoreTransformerOptions options) {
		transformerOptions = options;
	}
	
	public void removeModelElement(Element element) {
		if (element != null && !isRemoved(element)) {
			transformerOptions.getDeletedElementList().add(element);
		}
	}
	
	public boolean isRemoved(Element element) {
		return transformerOptions.getDeletedElementList().contains(element);
	}
	
	public boolean hasValidationSupport(Element element) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		return validationSupport != null;
	}

	public String getValidationSeverity(Element element) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			Object value = element.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SEVERITY);
			String severity = null;
			if (value instanceof EnumerationLiteral) {
				severity = ((EnumerationLiteral)value).getName();
			}
			else if (value instanceof Enumerator) {
				severity = ((Enumerator)value).getName();
			}
			
			return (severity != null) ? severity : SEVERITY_ERROR;
		}
		
		return null;
	}

	public void addValidationSupport(Property property, String constraintName) {
		String severity = SEVERITY_ERROR;
		String message = null;
		
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(property, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			message = (String) property.getValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE);
			severity = getValidationSeverity(property);
		}

		Class constrainedClass = property.getClass_();
		if (SEVERITY_INFO.equals(severity)) {
			addValidationInfo(constrainedClass, constraintName, message);
		} else if (SEVERITY_WARNING.equals(severity)) {
			addValidationWarning(constrainedClass, constraintName, message);
		} else {
			addValidationError(constrainedClass, constraintName, message);
		}
	}
	
	public void addValidationError(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_ERROR, constraintName);
		annotationsUtil.saveAnnotations();
		
		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationWarning(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_WARNING, constraintName);
		annotationsUtil.saveAnnotations();
		
		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationInfo(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_INFO, constraintName);
		annotationsUtil.saveAnnotations();
		
		addValidationMessage(constrainedClass, constraintName, message);
	}
	
	public void addValidationMessage(Class constrainedClass, String constraintName, String message) {
		if (message == null) {
			message = constraintName + " error message";
		}
		
		PluginPropertiesUtil properties = transformerOptions.getPluginPropertiesUtil();
		if (properties != null) {
			properties.addProperty(constraintName, message);
		}
	}

	protected Class getCDAClass(Class templateClass) {
		return CDAModelUtil.getCDAClass(templateClass);
	}
	
	protected Package getCDAPackage(Class templateClass) {
		for (Package package_ : templateClass.getNearestPackage().getImportedPackages()) {
			if (CDA_PACKAGE_NAME.equals(package_.getName())) {
				return package_;
			}
		}
		return null;
	}
	
	protected Property getCDAProperty(Property templateProperty) {
		return CDAModelUtil.getCDAProperty(templateProperty);
	}
	
	/**
	 * Returns the nearest inherited property with the same name, or null if not found.
	 */
	protected Property getInheritedProperty(Property templateProperty) {
		return CDAModelUtil.getInheritedProperty(templateProperty);
	}
	
	protected void addOCLConstraint(Property property, StringBuffer body) {
		addOCLConstraint(property, body, null);
	}
	
	protected void addOCLConstraint(Property property, StringBuffer body, String constraintName) {
		if (constraintName == null) {
			constraintName = createConstraintName(property);
		}
		
		if (property.getClass_().getOwnedRule(constraintName) != null) {
			String message = "Constraint name already defined: '" + constraintName 
					+ "' in " + property.getClass_().getQualifiedName();
			Logger.log(Logger.WARNING, message);
			
			// add validation message, if included in the model
			addValidationSupport(property, constraintName);
			
			return;
		}
		
		Constraint constraint = property.getClass_().createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(property.getClass_());

		OpaqueExpression expression = (OpaqueExpression)constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(body.toString());

		addValidationSupport(property, constraintName);
	}
	
	protected String createInheritedConstraintName(Property property) {
		String constraintName = null;
		if (SEVERITY_ERROR.equals(getValidationSeverity(property))) {
			Property inheritedProperty = CDAModelUtil.getInheritedProperty(property);
			if (CDAModelUtil.getTemplateId(inheritedProperty.getClass_()) != null) {
				constraintName = createInheritedConstraintName(inheritedProperty);
//				System.out.println("inheritedConstraintName for " + property.getQualifiedName() + " = " + constraintName);
			}
		}
		
		if (constraintName == null) {
			constraintName = createConstraintName(property);
		}
		return constraintName;
	}
	
	protected String createConstraintName(Property property) {
		return createConstraintName(property.getClass_(), property.getName().substring(0, 1).toUpperCase() + property.getName().substring(1));
	}
	
	protected String createConstraintName(Class umlClass, String suffix) {
		String prefix = null;
		
		for (Classifier classifier : umlClass.allParents()) {
			if (classifier instanceof Class) {
				Class class_ = (Class) classifier;
				if (umlClass.getName().equals(class_.getName())) {
					Package umlPackage = umlClass.getPackage();
					Stereotype ePackage = EcoreTransformUtil.getAppliedEcoreStereotype(umlPackage, UMLUtil.STEREOTYPE__E_PACKAGE);
					if (ePackage != null) {
						prefix = (String) umlPackage.getValue(ePackage, UMLUtil.TAG_DEFINITION__PREFIX);
						break;
					}
				}
			}
		}
		
		String constraintName = "";
		if (prefix != null) {
			constraintName += prefix;
		}
		constraintName += umlClass.getName();
		if (suffix != null) {
			constraintName += suffix;
		}
		
		return constraintName;
	}
	
	protected String normalizeConstraintName(String constraintName) {
		String result = "";
		String[] parts = constraintName.split("_");
		for (String part : parts) {
			result += part.substring(0, 1).toUpperCase() + part.substring(1);
		}
		return result;
	}
}
