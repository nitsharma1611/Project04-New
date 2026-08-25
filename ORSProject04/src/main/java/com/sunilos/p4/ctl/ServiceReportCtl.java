package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.ServiceBean;

import com.sunilos.p4.model.ServiceModel;


import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/ServiceReportCtl")
public class ServiceReportCtl extends BaseReportCtl<ServiceBean>{

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.SERVICE_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "SERVICE_LIST_COMPILED_REPORT";
	}

	@Override
	public List<ServiceBean> getList() {
		ServiceModel model=new ServiceModel();
		List<ServiceBean> list=model.list();
		
		return list;
	}

}
