package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.DepartmentBean;
import com.sunilos.p4.model.DepartmentModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/DepartmentListCtl")
public class DepartmentListCtl extends BaseListCtl<DepartmentBean, DepartmentModel>{

	
	
	
	
	@Override
	protected DepartmentBean populateBean(HttpServletRequest request) {
		DepartmentBean bean = new DepartmentBean();

		

		bean.setDepartmentName(DataUtility.getString(request.getParameter("departmentName")));

		bean.setHodName(DataUtility.getString(request.getParameter("hodName")));
		return bean;
	}

	@Override
	protected String getView() {
		
		return ORSView.DEPARTMENT_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.DEPARTMENT_LIST_VIEW;
	}

	@Override
	protected DepartmentModel getModel() {
		// TODO Auto-generated method stub
		return new DepartmentModel();
	}

}
