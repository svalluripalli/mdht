/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.example.standalone;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
//import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class Main {
	public static void main(String[] args) throws Exception {
		// Stand-alone example: load CCD document from file, print to console, validate
		CCDPackage.eINSTANCE.eClass();
		ClinicalDocument clinicalDocument = CDAUtil.load(new FileInputStream("input/CCD_Example.xml"));
		save(clinicalDocument);
		validate(clinicalDocument);

		// Stand-alone example: programmatically construct CCD document instance
		ContinuityOfCareDocument doc = CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();

		PurposeSection purposeSection = CCDFactory.eINSTANCE.createPurposeSection().init();
		doc.addSection(purposeSection);
		PurposeActivity purposeActivity = CCDFactory.eINSTANCE.createPurposeActivity().init();
		purposeSection.addAct(purposeActivity);
		SubstanceAdministration purposeReason = CDAFactory.eINSTANCE.createSubstanceAdministration();
		purposeActivity.addSubstanceAdministration(purposeReason);
		purposeActivity.getEntryRelationships().get(0).setTypeCode(x_ActRelationshipEntryRelationship.RSON);

		ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();
		ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();
		StatusObservation problemStatus = CCDFactory.eINSTANCE.createStatusObservation();
		ProblemHealthStatusObservation problemHealthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();
		EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();

		ProblemSection sect = CCDFactory.eINSTANCE.createProblemSection().init();
		sect.addAct(problemAct);
		problemAct.addObservation(problemObservation);

		sect.addObservation(problemStatus);
		sect.addObservation(problemHealthStatus);
		sect.addObservation(episodeObservation);

		doc.addSection(sect);

		save(doc);
		validate(doc);
	}

	public static void save(ClinicalDocument doc) throws Exception {
		CDAUtil.save(doc, System.out);
	}

	public static void validate(ClinicalDocument doc) {
		CDAUtil.validate(doc, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}

			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println("WARNING: " + diagnostic.getMessage());
			}

			@Override
			public void handleInfo(Diagnostic diagnostic) {
				System.out.println("INFO: " + diagnostic.getMessage());
			}
		});
	}
}
