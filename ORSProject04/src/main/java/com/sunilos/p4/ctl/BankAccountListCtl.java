package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.bean.LibraryBean;
import com.sunilos.p4.model.BankAccountModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/BankAccountListCtl")
public class BankAccountListCtl extends BaseListCtl<BankAccountBean, BankAccountModel>{

	@Override
	protected BankAccountBean populateBean(HttpServletRequest request) {
		BankAccountBean bean = new BankAccountBean();

		bean.setAccountNumber(DataUtility.getString(request.getParameter("accountNumber")));

		bean.setAccountHolderName(DataUtility.getString(request.getParameter("accountHolderName")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.BANK_ACCOUNT_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.BANK_ACCOUNT_LIST_VIEW;
	}

	@Override
	protected BankAccountModel getModel() {
		// TODO Auto-generated method stub
		return new BankAccountModel();
	}

}
