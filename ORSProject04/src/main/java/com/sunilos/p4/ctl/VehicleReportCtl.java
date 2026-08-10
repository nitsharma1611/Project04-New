package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.VehicleBean;
import com.sunilos.p4.model.VehicleModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/VehicleReportCtl")
public class VehicleReportCtl extends BaseReportCtl<VehicleBean> {

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.VEHICLE_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "VEHICLE_LIST_COMPILED_REPORT";
	}

	@Override
	public List<VehicleBean> getList() {
		VehicleModel model=new VehicleModel();
		List<VehicleBean> list=model.list();
		
		return list;
	}

}
