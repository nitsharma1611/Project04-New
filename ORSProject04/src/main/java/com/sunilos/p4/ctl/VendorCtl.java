package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.bean.VendorBean;
import com.sunilos.p4.model.BankAccountModel;
import com.sunilos.p4.model.VendorModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/VendorCtl")
public class VendorCtl extends BaseCtl<VendorBean, VendorModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("vendorName"))) {
			request.setAttribute("vendorName", PropertyReader.getValue("error.require", "VendorName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("mobileNo"))) {
			request.setAttribute("mobileNo", PropertyReader.getValue("error.require", "MobileNo"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("address"))) {
			request.setAttribute("address", PropertyReader.getValue("error.require", "Address"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("serviceType"))) {
			request.setAttribute("serviceType", PropertyReader.getValue("error.require", "ServiceType"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected VendorBean populateBean(HttpServletRequest request) {
		VendorBean bean = new VendorBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setVendorName(DataUtility.getString(request.getParameter("vendorName")));

		bean.setMobileNo(DataUtility.getString(request.getParameter("mobileNo")));

		bean.setAddress(DataUtility.getString(request.getParameter("address")));
		bean.setServiceType(DataUtility.getString(request.getParameter("serviceType")));
		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.VENDOR_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.VENDOR_LIST_CTL;
		} else {
			return ORSView.VENDOR_VIEW;
		}
	}

	@Override
	protected VendorModel getModel() {
		// TODO Auto-generated method stub
		return new VendorModel();
	}
}
