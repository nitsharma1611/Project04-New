package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.DoctorBean;
import com.sunilos.p4.model.DoctorModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/DoctorCtl")
public class DoctorCtl extends BaseCtl<DoctorBean, DoctorModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("doctorName"))) {
			request.setAttribute("doctorName", PropertyReader.getValue("error.require", "DoctorName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("specialization"))) {
			request.setAttribute("specialization", PropertyReader.getValue("error.require", "Specialization"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("experience"))) {
			request.setAttribute("experience", PropertyReader.getValue("error.require", "Experience"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("contactNo"))) {
			request.setAttribute("contactNo", PropertyReader.getValue("error.require", "ContactNo"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected DoctorBean populateBean(HttpServletRequest request) {
		DoctorBean bean = new DoctorBean();

		bean.setDoctorName(DataUtility.getString(request.getParameter("doctorName")));

		bean.setSpecialization(DataUtility.getString(request.getParameter("specialization")));

		bean.setExperience(DataUtility.getInt(request.getParameter("experience")));
		bean.setContactNo(DataUtility.getString(request.getParameter("contactNo")));
		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		
		return ORSView.DOCTOR_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.DOCTOR_LIST_CTL;
		} else {
			return ORSView.DOCTOR_VIEW;
		}
	}

	@Override
	protected DoctorModel getModel() {
	
		return new DoctorModel();
	}

}
