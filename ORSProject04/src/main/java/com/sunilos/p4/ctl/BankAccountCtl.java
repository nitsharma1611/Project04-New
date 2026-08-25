package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.bean.LibraryBean;
import com.sunilos.p4.model.BankAccountModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/BankAccountCtl")
public class BankAccountCtl extends BaseCtl<BankAccountBean, BankAccountModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("accountNumber"))) {
			request.setAttribute("accountNumber", PropertyReader.getValue("error.require", "AccountNumber"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("accountHolderName"))) {
			request.setAttribute("accountHolderName", PropertyReader.getValue("error.require", "AccountHolderName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("accountType"))) {
			request.setAttribute("accountType", PropertyReader.getValue("error.require", "AccountType"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("branchName"))) {
			request.setAttribute("branchName", PropertyReader.getValue("error.require", "BranchName"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("balance"))) {
			request.setAttribute("balance", PropertyReader.getValue("error.require", "Balance"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected BankAccountBean populateBean(HttpServletRequest request) {
		BankAccountBean bean = new BankAccountBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setAccountNumber(DataUtility.getString(request.getParameter("accountNumber")));

		bean.setAccountHolderName(DataUtility.getString(request.getParameter("accountHolderName")));

		bean.setBalance(DataUtility.getDouble(request.getParameter("balance")));
		bean.setAccountType(DataUtility.getString(request.getParameter("accountType")));
		bean.setBranchName(DataUtility.getString(request.getParameter("branchName")));
		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.BANK_ACCOUNT_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.BANK_ACCOUNT_LIST_CTL;
		} else {
			return ORSView.BANK_ACCOUNT_VIEW;
		}
	}
	@Override
	protected BankAccountModel getModel() {
		// TODO Auto-generated method stub
		return new BankAccountModel();
	}

}
