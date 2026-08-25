package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.EmployeeBean;

import com.sunilos.p4.model.EmployeeModel;

import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
@WebServlet("/ctl/EmployeeCtl")
public class EmployeeCtl extends BaseCtl<EmployeeBean, EmployeeModel> {
	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;
		String salary =request.getParameter("salary");
		String joiningDate  = request.getParameter("joiningDate");
		if (DataValidator.isNull(request.getParameter("name"))) {
			request.setAttribute("name", PropertyReader.getValue("error.require", "Name"));
			pass = false;
		}

		if (DataValidator.isNull(salary)) {
			request.setAttribute("salary", PropertyReader.getValue("error.require", "Salary"));
			pass = false;
		}
		else if (!DataValidator.isDouble(salary)) {
		    request.setAttribute("salary", "Salary must be numeric");
		    pass = false;
		}

		if (DataValidator.isNull(request.getParameter("designation"))) {
			request.setAttribute("designation", PropertyReader.getValue("error.require", "Designation"));
			pass = false;
		}
		
		if (DataValidator.isNull(joiningDate)) {
			request.setAttribute("joiningDate", PropertyReader.getValue("error.require", "JoiningDate"));
			pass = false;
		} else if (!DataValidator.isDate(joiningDate)) {
			request.setAttribute("joiningDate", PropertyReader.getValue("error.date", "JoiningDate"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected EmployeeBean populateBean(HttpServletRequest request) {
		EmployeeBean bean = new EmployeeBean();
bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setName(DataUtility.getString(request.getParameter("name")));

		bean.setSalary(DataUtility.getDouble(request.getParameter("salary")));

		bean.setDesignation(DataUtility.getString(request.getParameter("designation")));
		bean.setJoiningDate(DataUtility.getDate(request.getParameter("joiningDate")));
		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.EMPLOYEE_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.EMPLOYEE_LIST_CTL;
		} else {
			return ORSView.EMPLOYEE_VIEW;
		}
	}

	@Override
	protected EmployeeModel getModel() {
		// TODO Auto-generated method stub
		return new EmployeeModel();
	}

}
