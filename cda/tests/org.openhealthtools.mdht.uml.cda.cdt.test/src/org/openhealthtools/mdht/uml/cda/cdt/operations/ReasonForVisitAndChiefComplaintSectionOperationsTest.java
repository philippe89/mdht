/**
 * Copyright (c) 2010 IBM Corporation
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
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperationsTest;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class ReasonForVisitAndChiefComplaintSectionOperationsTest extends
		SectionOperationsTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.2.8";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
	// -------------------------------------------------------------
	new TemplateIDValidationTest(TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return ReasonForVisitAndChiefComplaintSectionOperations
					.validateReasonForVisitAndChiefComplaintSectionTemplateId(
							(ReasonForVisitAndChiefComplaintSection) objectToTest,
							diagnostician, map);
		}

	} }; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	/**
	 * @see org.openhealthtools.mdht.uml.cda.operations.MutualExclusionValidationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return CDTFactory.eINSTANCE
				.createReasonForVisitAndChiefComplaintSection();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ReasonForVisitAndChiefComplaintSectionOperations#validateReasonForVisitAndChiefComplaintSectionCode(org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateReasonForVisitAndChiefComplaintSectionCode() {
		fail("Not yet implemented");
	}

} // ReasonForVisitAndChiefComplaintSectionOperationsTest