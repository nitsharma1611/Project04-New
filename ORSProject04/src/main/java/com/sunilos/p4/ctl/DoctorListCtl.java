package com.sunilos.p4.ctl;




import com.sunilos.p4.bean.DoctorBean;

import com.sunilos.p4.model.DoctorModel;
import com.sunilos.p4.util.DataUtility;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;


@WebServlet("/ctl/DoctorListCtl")
public class DoctorListCtl extends BaseListCtl<DoctorBean, DoctorModel> {

	@Override
	protected DoctorBean populateBean(HttpServletRequest request) {
		DoctorBean bean = new DoctorBean();

		bean.setDoctorName(DataUtility.getString(request.getParameter("doctorName")));

		bean.setSpecialization(DataUtility.getString(request.getParameter("specialization")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.DOCTOR_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.DOCTOR_LIST_VIEW;
	}

	@Override
	protected DoctorModel getModel() {
		// TODO Auto-generated method stub
		return new DoctorModel();
	}

}
