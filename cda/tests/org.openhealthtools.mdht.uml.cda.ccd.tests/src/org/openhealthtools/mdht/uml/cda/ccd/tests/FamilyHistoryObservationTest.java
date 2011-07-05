/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Family History Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation#validateFamilyHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation#validateFamilyHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation#validateFamilyHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation#validateFamilyHistoryObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFamilyHistoryObservationTemplateId() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationTemplateId(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFamilyHistoryObservationId() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationIdTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationId(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFamilyHistoryObservationStatusCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationStatusCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationStatusCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationEffectiveTime() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationEffectiveTimeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationEffectiveTime(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateFamilyHistoryObservationAgeObservation() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationAgeObservationTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				AgeObservation ao = CCDFactory.eINSTANCE.createAgeObservation();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ao);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationAgeObservation(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		FamilyHistoryObservation target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends FamilyHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryObservation> {
		public FamilyHistoryObservation create() {
			return CCDFactory.eINSTANCE.createFamilyHistoryObservation();
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
	* @generated
	*/
	private static class ConstructorTestClass extends FamilyHistoryObservationOperations {
	}

	/**
	* Tests Operations Constructor for 100% coverage
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

} // FamilyHistoryObservationOperations