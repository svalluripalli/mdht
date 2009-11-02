/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;

import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection#DischargeDiagnosisSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Discharge Diagnosis Section template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeDiagnosisSectionOperations extends org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeDiagnosisSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeDiagnosisSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #DischargeDiagnosisSection_templateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Discharge Diagnosis Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DischargeDiagnosisSection_templateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.83.111')";

	/**
	 * The cached OCL invariant for the '{@link #DischargeDiagnosisSection_templateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Discharge Diagnosis Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DischargeDiagnosisSection_templateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.111')
	 * @param dischargeDiagnosisSection The receiving '<em><b>Discharge Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean DischargeDiagnosisSection_templateId(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DISCHARGE_DIAGNOSIS_SECTION);
			try {
				DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("DischargeDiagnosisSection_templateId"),
						 new Object [] { dischargeDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

} // DischargeDiagnosisSectionOperations