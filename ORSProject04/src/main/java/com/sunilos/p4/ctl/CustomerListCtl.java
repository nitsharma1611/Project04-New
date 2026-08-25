package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.model.CustomerModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/CustomerListCtl")
public class CustomerListCtl extends BaseListCtl<CustomerBean, CustomerModel> {

	@Override
	protected CustomerBean populateBean(HttpServletRequest request) {
		CustomerBean bean = new CustomerBean();
		bean.setCustomerName(DataUtility.getString(request.getParameter("customerName")));

		bean.setPhoneNumber(DataUtility.getString(request.getParameter("phoneNumber")));

		bean.setAddress(DataUtility.getString(request.getParameter("address")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.CUSTOMER_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.CUSTOMER_LIST_VIEW;
	}

	@Override
	protected CustomerModel getModel() {
		// TODO Auto-generated method stub
		return new CustomerModel();
	}

}
