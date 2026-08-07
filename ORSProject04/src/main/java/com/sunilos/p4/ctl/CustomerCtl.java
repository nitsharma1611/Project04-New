package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.bean.DepartmentBean;
import com.sunilos.p4.model.CustomerModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/CustomerCtl")
public class CustomerCtl extends BaseCtl<CustomerBean, CustomerModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("customerName"))) {
			request.setAttribute("customerName", PropertyReader.getValue("error.require", "CustomerName"));
			pass = false;
		}

		if (!DataValidator.isEmail(request.getParameter("email"))) {
			request.setAttribute("email", PropertyReader.getValue("error.require", "Email"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("phoneNumber"))) {
			request.setAttribute("phoneNumber", PropertyReader.getValue("error.require", "PhoneNumber"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("address"))) {
			request.setAttribute("address", PropertyReader.getValue("error.require", "Address"));
			pass = false;
		}
		

		return pass;
	}

	@Override
	protected CustomerBean populateBean(HttpServletRequest request) {
		CustomerBean bean = new CustomerBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setCustomerName(DataUtility.getString(request.getParameter("customerName")));

		bean.setEmail(DataUtility.getString(request.getParameter("email")));
		System.out.println(request.getParameter("email"));
		bean.setPhoneNumber(DataUtility.getString(request.getParameter("phoneNumber")));

		bean.setAddress(DataUtility.getString(request.getParameter("address")));
		
		
		populateDTO(bean, request);

	

		return bean;

	}
	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.CUSTOMER_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.CUSTOMER_LIST_CTL;
		} else {
			return ORSView.CUSTOMER_VIEW;
		}
	}


	@Override
	protected CustomerModel getModel() {
		// TODO Auto-generated method stub
		return new CustomerModel();
	}

}
