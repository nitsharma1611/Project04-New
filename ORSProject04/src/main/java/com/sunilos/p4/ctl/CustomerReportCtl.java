package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.model.CustomerModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/CustomerReportCtl")
public class CustomerReportCtl extends BaseReportCtl<CustomerBean> {

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.CUSTOMER_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "CUSTOMER_LIST_COMPILED_REPORT";
	}

	@Override
	public List<CustomerBean> getList() {
		CustomerModel model=new CustomerModel();
		List<CustomerBean> list=model.list();
		
		return list;
	}

}
