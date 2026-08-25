package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.ServiceBean;
import com.sunilos.p4.model.ServiceModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/ServiceListCtl")
public class ServiceListCtl extends BaseListCtl<ServiceBean, ServiceModel>{

	@Override
	protected ServiceBean populateBean(HttpServletRequest request) {
		ServiceBean bean = new ServiceBean();

		bean.setServiceName(DataUtility.getString(request.getParameter("serviceName")));

		bean.setDescription(DataUtility.getString(request.getParameter("description")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.SERVICE_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.SERVICE_LIST_VIEW;
	}

	@Override
	protected ServiceModel getModel() {
		// TODO Auto-generated method stub
		return new ServiceModel();
	}

}
