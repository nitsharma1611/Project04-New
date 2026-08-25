package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.DoctorBean;
import com.sunilos.p4.bean.PatientBean;
import com.sunilos.p4.model.DoctorModel;
import com.sunilos.p4.model.PatientModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/PatientCtl")
public class PatientCtl extends BaseCtl<PatientBean, PatientModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("patientName"))) {
			request.setAttribute("patientName", PropertyReader.getValue("error.require", "PatientName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("disease"))) {
			request.setAttribute("disease", PropertyReader.getValue("error.require", "Disease"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("doctorName"))) {
			request.setAttribute("doctorName", PropertyReader.getValue("error.require", "DoctorName"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("admissionDate"))) {
			request.setAttribute("admissionDate", PropertyReader.getValue("error.require", "AdmissionDate"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected PatientBean populateBean(HttpServletRequest request) {
		PatientBean bean = new PatientBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setDoctorName(DataUtility.getString(request.getParameter("doctorName")));

		bean.setDisease(DataUtility.getString(request.getParameter("disease")));

		bean.setPatientName(DataUtility.getString(request.getParameter("patientName")));
		bean.setAdmissionDate(DataUtility.getDate(request.getParameter("admissionDate")));
		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		
		return ORSView.PATIENT_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.PATIENT_LIST_CTL;
		} else {
			return ORSView.PATIENT_VIEW;
		}
	}

	@Override
	protected PatientModel getModel() {
	
		return new PatientModel();
	}

}
