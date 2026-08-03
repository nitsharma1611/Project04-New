package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.SmartLightBean;
import com.sunilos.p4.model.SmartLightModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/SmartLightReportCtl")
public class SmartLightReportCtl extends BaseReportCtl<SmartLightBean> {

	@Override
	public String getView() {
		
		return ORSView.SMART_LIGHT_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "SMART_LIGHT_LIST_COMPILED_REPORT";
	}

	@Override
	public List<SmartLightBean> getList() {
		SmartLightModel model=new SmartLightModel();
		List<SmartLightBean> list =model.list();
		return list;
	}

}
