package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.bean.VendorBean;
import com.sunilos.p4.model.BankAccountModel;
import com.sunilos.p4.model.VendorModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/VendorListCtl")
public class VendorListCtl extends BaseListCtl<VendorBean, VendorModel> {

	@Override
	protected VendorBean populateBean(HttpServletRequest request) {
		VendorBean bean = new VendorBean();

		bean.setVendorName(DataUtility.getString(request.getParameter("vendorName")));

		bean.setAddress(DataUtility.getString(request.getParameter("address")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.VENDOR_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.VENDOR_LIST_VIEW;
	}

	@Override
	protected VendorModel getModel() {
		// TODO Auto-generated method stub
		return new VendorModel();
	}

}
