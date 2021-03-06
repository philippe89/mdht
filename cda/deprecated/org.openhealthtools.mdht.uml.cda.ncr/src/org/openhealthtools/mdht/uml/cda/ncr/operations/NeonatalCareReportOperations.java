/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ncr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPlugin;
import org.openhealthtools.mdht.uml.cda.ncr.NeonatalCareReport;
import org.openhealthtools.mdht.uml.cda.ncr.util.NCRValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neonatal Care Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalCareReport#validateNeonatalCareReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal Care Report Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalCareReport#validateNeonatalCareReportPatientDataSectionNCR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal Care Report Patient Data Section NCR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeonatalCareReportOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeonatalCareReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalCareReportTemplateId(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal Care Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalCareReportTemplateId(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_CARE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalCareReportTemplateId(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal Care Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalCareReportTemplateId(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_CARE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.1.1')
	 * @param neonatalCareReport The receiving '<em><b>Neonatal Care Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalCareReportTemplateId(NeonatalCareReport neonatalCareReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_CARE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_CARE_REPORT);
			try {
				VALIDATE_NEONATAL_CARE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_CARE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_CARE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalCareReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_CARE_REPORT__NEONATAL_CARE_REPORT_TEMPLATE_ID,
						 NCRPlugin.INSTANCE.getString("NeonatalCareReportTemplateId"),
						 new Object [] { neonatalCareReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalCareReportPatientDataSectionNCR(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal Care Report Patient Data Section NCR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalCareReportPatientDataSectionNCR(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ncr::PatientDataSectionNCR))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalCareReportPatientDataSectionNCR(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal Care Report Patient Data Section NCR</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalCareReportPatientDataSectionNCR(NeonatalCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ncr::PatientDataSectionNCR))
	 * @param neonatalCareReport The receiving '<em><b>Neonatal Care Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalCareReportPatientDataSectionNCR(NeonatalCareReport neonatalCareReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_CARE_REPORT);
			try {
				VALIDATE_NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalCareReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_CARE_REPORT__NEONATAL_CARE_REPORT_PATIENT_DATA_SECTION_NCR,
						 NCRPlugin.INSTANCE.getString("NeonatalCareReportPatientDataSectionNCR"),
						 new Object [] { neonatalCareReport }));
			}
			return false;
		}
		return true;
	}

} // NeonatalCareReportOperations