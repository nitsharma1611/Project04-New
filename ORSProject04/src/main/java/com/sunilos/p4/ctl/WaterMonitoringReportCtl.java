package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.WaterMonitoringBean;
import com.sunilos.p4.model.WaterMonitoringModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/WaterMonitoringReportCtl")
public class WaterMonitoringReportCtl extends BaseReportCtl<WaterMonitoringBean>{

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.WATER_MONITORING_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "WATER_MONITORING_LIST_COMPILED_REPORT";
	}

	@Override
	public List<WaterMonitoringBean> getList() {
		WaterMonitoringModel model=new WaterMonitoringModel();
		List<WaterMonitoringBean>list= model.list();
		return list;
	}

}
