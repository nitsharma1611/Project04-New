package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.PatientBean;

import com.sunilos.p4.model.PatientModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/PatientListCtl")
public class PatientListCtl extends BaseListCtl<PatientBean, PatientModel> {

	@Override
	protected PatientBean populateBean(HttpServletRequest request) {
		PatientBean bean = new PatientBean();

		bean.setDisease(DataUtility.getString(request.getParameter("disease")));

		bean.setPatientName(DataUtility.getString(request.getParameter("patientName")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.PATIENT_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.PATIENT_LIST_VIEW;
	}

	@Override
	protected PatientModel getModel() {
		// TODO Auto-generated method stub
		return new PatientModel();
	}}
