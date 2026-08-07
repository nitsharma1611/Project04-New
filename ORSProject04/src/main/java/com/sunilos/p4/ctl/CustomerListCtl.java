package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.model.CustomerModel;

import jakarta.servlet.annotation.WebServlet;
@WebServlet("/ctl/CustomerListCtl")
public class CustomerListCtl  extends BaseListCtl<CustomerBean, CustomerModel>{

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected CustomerModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
