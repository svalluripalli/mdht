/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer#validateResultOrganizerCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer#validateResultOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer#validateResultOrganizerResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer#getResultObservations() <em>Get Result Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerCodeValue() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerCodeValueTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("");
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.12");
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerCodeValue(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerTemplateId(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerId() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerIdTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerId(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerStatusCode() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerStatusCodeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerStatusCode(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerCode() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerCodeTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerCode(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerResultObservation() {
		OperationsTestCase<ResultOrganizer> validateResultOrganizerResultObservationTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();
				ResultObservation resultObs = ConsolFactory.eINSTANCE.createResultObservation();
				target.addObservation(resultObs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerOperations.validateResultOrganizerResultObservation(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultObservations() {

		ResultOrganizer target = objectFactory.create();
		target.getResultObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultOrganizer> {
		public ResultOrganizer create() {
			return ConsolFactory.eINSTANCE.createResultOrganizer();
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
	private static class ConstructorTestClass extends ResultOrganizerOperations {
	};

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

} // ResultOrganizerOperations
