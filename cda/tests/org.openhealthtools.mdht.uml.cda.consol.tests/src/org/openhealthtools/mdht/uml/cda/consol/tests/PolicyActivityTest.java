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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityAuthorizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Authorization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Person Name And Or Org Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#getAuthorizationActivities() <em>Get Authorization Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PolicyActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityClassCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityClassCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityClassCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD("A", "2.16.840.1.113883.6.1", null, null);
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII("12345678-0");
				target.getIds().add(ii);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityMoodCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityMoodCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityMoodCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityStatusCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityStatusCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityStatusCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityAuthorizationActivity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityAuthorizationActivityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityAuthorizationActivity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_AUTHORIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PolicyActivity target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createAuthorizationActivity().init());

				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityAuthorizationActivity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityAuthorizationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayer() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayer",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);

				Performer2 guarantor = createPerformer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", ""));

				guarantor.setAssignedEntity(ae);
				target.getPerformers().add(guarantor);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayer(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantor() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantor",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Performer2 guarantor = createPerformer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", ""));

				guarantor.setAssignedEntity(ae);
				target.getPerformers().add(guarantor);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantor(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCoverage() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverage",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getParticipants().add(createCoverage());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverage(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityHolder() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolder",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolder(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationNameTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				payerEntity.getRepresentedOrganizations().add(repOrg);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				ON name = DatatypesFactory.eINSTANCE.createON();
				repOrg.getNames().add(name);

				payerEntity.getRepresentedOrganizations().add(repOrg);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getIds().clear();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.setCode(null);
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getTelecoms().clear();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityTelecom(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityPayerOrganization() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityPayerOrganization",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				payerEntity.getRepresentedOrganizations().add(repOrg);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated  NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				payer.setTypeCode(ParticipationPhysicalPerformer.SPRF);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				payer.setTypeCode(ParticipationPhysicalPerformer.PRF);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(payer);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				payer.setAssignedEntity(createPayerAssignedEntity());
				target.getPerformers().add(payer);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgNameTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
				payer.setAssignedEntity(guarantorEntity);

				Person person = CDAFactory.eINSTANCE.createPerson();
				guarantorEntity.setAssignedPerson(person);

			}

			// Case with Person & Represented Organization
			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
				payer.setAssignedEntity(guarantorEntity);

				Person person = CDAFactory.eINSTANCE.createPerson();
				PN pn11 = DatatypesFactory.eINSTANCE.createPN();
				person.getNames().add(pn11);
				guarantorEntity.setAssignedPerson(person);

				Organization org = CDAFactory.eINSTANCE.createOrganization();
				guarantorEntity.getRepresentedOrganizations().add(org);
				ON on1 = DatatypesFactory.eINSTANCE.createON();
				org.getNames().add(on1);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with Person only
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						target.getPerformers().add(payer);
						AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
						payer.setAssignedEntity(guarantorEntity);

						Person person = CDAFactory.eINSTANCE.createPerson();
						PN pn11 = DatatypesFactory.eINSTANCE.createPN();
						person.getNames().add(pn11);
						guarantorEntity.setAssignedPerson(person);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with RepresentedOrganization only
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						target.getPerformers().add(payer);
						AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
						payer.setAssignedEntity(guarantorEntity);

						Organization org = CDAFactory.eINSTANCE.createOrganization();
						guarantorEntity.getRepresentedOrganizations().add(org);
						ON on1 = DatatypesFactory.eINSTANCE.createON();
						org.getNames().add(on1);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.setAssignedEntity(createGuarantorAssignedEntity());
				guarantor.getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.111X"));
				target.getPerformers().add(guarantor);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.setAssignedEntity(createGuarantorAssignedEntity());
				target.getPerformers().add(guarantor);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				gEntity.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// guarantor.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				guarantor.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				guarantor.setTypeCode(ParticipationPhysicalPerformer.PPRF);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				guarantor.setTypeCode(ParticipationPhysicalPerformer.PRF);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipFailsTest();
			}

			// Skipping this test as the condition requires AssignedEntity code is
			// checked for a Guarantor..
			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				// AssignedEntity gEntity = createPayerAssignedEntity();
				// guarantor.setAssignedEntity(gEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityNameTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				// coverage.getParticipantRole().getPlayingEntity().getNames().add(DatatypesFactory.eINSTANCE.createPN());

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getPlayingEntity().getNames().add(DatatypesFactory.eINSTANCE.createPN());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				coverage.setParticipantRole(pr);

				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				pr.setCode(DatatypesFactory.eINSTANCE.createCE("FAMDEP", "2.16.840.1.113883.5.111"));
				coverage.setParticipantRole(pr);
				// 2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				// coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected void updateToPass(PolicyActivity target) {

				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRole() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRole",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				CDAFactory.eINSTANCE.createParticipantRole();
				CDAFactory.eINSTANCE.createPlayingEntity();
				// role.setPlayingEntity(pEntity);
				// coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {

				target.getParticipants().clear();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRole(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderHolderRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderHolderRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);

				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				holder.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRole() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRole",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				holder.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				target.getParticipants().add(holder);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRole(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderHolderRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAuthorizationActivities() {

		PolicyActivity target = objectFactory.create();
		target.getAuthorizationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PolicyActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PolicyActivity> {
		public PolicyActivity create() {
			return ConsolFactory.eINSTANCE.createPolicyActivity();
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
	private static class ConstructorTestClass extends PolicyActivityOperations {
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

	/**
	 * Convenience Method for creating AssignedEntity for Payer
	 */
	private static AssignedEntity createPayerAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("EMP", "2.16.840.1.113883.5.110"));
		assignedEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
		assignedEntity.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
		return assignedEntity;
	}

	private static AssignedEntity createGuarantorAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.111"));
		return assignedEntity;
	}

	private static Performer2 createPerformer() {
		Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
		return performer;
	}

	private static Participant2 createCoverage() {
		Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
		ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
		PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
		role.setPlayingEntity(pEntity);
		coverage.setParticipantRole(role);
		coverage.setTypeCode(ParticipationType.COV);
		return coverage;
	}

	private static Participant2 createHolder() {
		Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
		return holder;
	}

} // PolicyActivityOperations
