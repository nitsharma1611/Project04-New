package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.EmployeeBean;

import com.sunilos.p4.model.EmployeeModel;

import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/EmployeeListCtl")
public class EmployeeListCtl extends BaseListCtl<EmployeeBean, EmployeeModel> {
	@Override
	protected EmployeeBean populateBean(HttpServletRequest request) {
		EmployeeBean bean = new EmployeeBean();

		bean.setName(DataUtility.getString(request.getParameter("name")));
		bean.setDesignation(DataUtility.getString(request.getParameter("designation")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.EMPLOYEE_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.EMPLOYEE_LIST_VIEW;
	}

	@Override
	protected EmployeeModel getModel() {
		// TODO Auto-generated method stub
		return new EmployeeModel();
	}

}
