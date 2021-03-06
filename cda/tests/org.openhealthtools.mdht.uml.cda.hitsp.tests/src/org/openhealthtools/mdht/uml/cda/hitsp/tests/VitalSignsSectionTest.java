/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.VitalSignsSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Vital Signs Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection#validateHITSPVitalSignsSectionVitalSignEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Vital Sign Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection#validateHITSPVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPVitalSignsSectionVitalSignEntry() {
		OperationsTestCase<VitalSignsSection> validateHITSPVitalSignsSectionVitalSignEntryTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateHITSPVitalSignsSectionVitalSignEntry",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();
				VitalSignsOrganizer organizer = IHEFactory.eINSTANCE.createVitalSignsOrganizer().init();
				target.addOrganizer(organizer);

				Component4 component = CDAFactory.eINSTANCE.createComponent4();
				VitalSign observation = HITSPFactory.eINSTANCE.createVitalSign().init();
				component.setObservation(observation);
				organizer.getComponents().add(component);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateHITSPVitalSignsSectionVitalSignEntry(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPVitalSignsSectionVitalSignEntryTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPVitalSignsSectionTemplateId() {
		OperationsTestCase<VitalSignsSection> validateHITSPVitalSignsSectionTemplateIdTestCase = new OperationsTestCase<VitalSignsSection>(
			"validateHITSPVitalSignsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionOperations.validateHITSPVitalSignsSectionTemplateId(
					(VitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPVitalSignsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends VitalSignsSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<VitalSignsSection> {

		public VitalSignsSection create() {
			return HITSPFactory.eINSTANCE.createVitalSignsSection();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends VitalSignsSectionOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // VitalSignsSectionOperations
