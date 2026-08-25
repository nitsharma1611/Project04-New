package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.DepartmentBean;
import com.sunilos.p4.model.DepartmentModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/DepartmentCtl")
public class DepartmentCtl extends BaseCtl<DepartmentBean, DepartmentModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("departmentName"))) {
			request.setAttribute("departmentName", PropertyReader.getValue("error.require", "DepartmentName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("hodName"))) {
			request.setAttribute("hodName", PropertyReader.getValue("error.require", "HodName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("totalFaculty"))) {
			request.setAttribute("totalFaculty", PropertyReader.getValue("error.require", "TotalFaculty"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("location"))) {
			request.setAttribute("location", PropertyReader.getValue("error.require", "Location"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected DepartmentBean populateBean(HttpServletRequest request) {
		DepartmentBean bean = new DepartmentBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setDepartmentName(DataUtility.getString(request.getParameter("departmentName")));

		bean.setHodName(DataUtility.getString(request.getParameter("hodName")));

		bean.setTotalFaculty(DataUtility.getInt(request.getParameter("totalFaculty")));

		bean.setLocation(DataUtility.getString(request.getParameter("location")));
		bean.setStatus(DataUtility.getString(request.getParameter("status")));
		
		populateDTO(bean, request);

	

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.DEPARTMENT_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.DEPARTMENT_LIST_CTL;
		} else {
			return ORSView.DEPARTMENT_VIEW;
		}
	}


	@Override
	protected DepartmentModel getModel() {
		// TODO Auto-generated method stub
		return new DepartmentModel();
	}

}
