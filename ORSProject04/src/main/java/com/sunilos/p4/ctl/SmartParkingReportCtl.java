package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.SmartParkingBean;
import com.sunilos.p4.model.SmartParkingModel;

import jakarta.servlet.annotation.WebServlet;
@WebServlet("/ctl/SmartParkingReportCtl")
public class SmartParkingReportCtl extends BaseReportCtl<SmartParkingBean> {

	@Override
	public String getView() {
		
		return ORSView.SMART_PARKING_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		
		return "SMART_PARKING_LIST_COMPILED_REPORT";
	}

	@Override
	public List<SmartParkingBean> getList() {
		SmartParkingModel model=new SmartParkingModel();
		List<SmartParkingBean> list=model.list();
		return list;
	}

}
