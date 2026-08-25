package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.ServiceBean;
import com.sunilos.p4.model.ServiceModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/ServiceCtl")
public class ServiceCtl extends BaseCtl<ServiceBean, ServiceModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("serviceName"))) {
			request.setAttribute("serviceName", PropertyReader.getValue("error.require", "ServiceName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("price"))) {
			request.setAttribute("price", PropertyReader.getValue("error.require", "Price"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("description"))) {
			request.setAttribute("description", PropertyReader.getValue("error.require", "Description"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("serviceCategory"))) {
			request.setAttribute("serviceCategory", PropertyReader.getValue("error.require", "ServiceCategory"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected ServiceBean populateBean(HttpServletRequest request) {
		ServiceBean bean = new ServiceBean();
bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setServiceName(DataUtility.getString(request.getParameter("serviceName")));

		bean.setPrice(DataUtility.getDouble(request.getParameter("price")));

		bean.setDescription(DataUtility.getString(request.getParameter("description")));
		bean.setServiceCategory(DataUtility.getString(request.getParameter("serviceCategory")));
		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.SERVICE_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.SERVICE_LIST_CTL;
		} else {
			return ORSView.SERVICE_VIEW;
		}
	}

	@Override
	protected ServiceModel getModel() {
		// TODO Auto-generated method stub
		return new ServiceModel();
	}
}
