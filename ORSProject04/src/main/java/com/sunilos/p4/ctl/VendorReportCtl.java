package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.bean.VendorBean;
import com.sunilos.p4.model.BankAccountModel;
import com.sunilos.p4.model.VendorModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/VendorReportCtl")
public class VendorReportCtl extends BaseReportCtl<VendorBean>{

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.VENDOR_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "VENDOR_LIST_COMPILED_REPORT";
	}

	@Override
	public List<VendorBean> getList() {
		VendorModel model=new VendorModel();
		List<VendorBean> list=model.list();
		
		return list;
	}

}
