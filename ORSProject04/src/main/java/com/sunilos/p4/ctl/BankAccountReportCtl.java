package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.model.BankAccountModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/BankAccountReportCtl")
public class BankAccountReportCtl extends BaseReportCtl<BankAccountBean> {

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.BANK_ACCOUNT_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "BANK_ACCOUNT_LIST_COMPILED_REPORT";
	}

	@Override
	public List<BankAccountBean> getList() {
		BankAccountModel model=new BankAccountModel();
		List<BankAccountBean> list=model.list();
		
		return list;
	}

}
