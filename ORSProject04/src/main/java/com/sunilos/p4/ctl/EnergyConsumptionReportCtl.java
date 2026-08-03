package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.EnergyConsumptionBean;
import com.sunilos.p4.model.EnergyConsumptionModel;

import jakarta.servlet.annotation.WebServlet;
@WebServlet("/ctl/EnergyConsumptionReportCtl")
public class EnergyConsumptionReportCtl extends BaseReportCtl<EnergyConsumptionBean> {

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.ENERGY_CONSUMPTION_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "ENERGY_CONSUMPTION_LIST_COMPILED_REPORT";
	}

	@Override
	public List<EnergyConsumptionBean> getList() {
		EnergyConsumptionModel model=new EnergyConsumptionModel();
		List<EnergyConsumptionBean> list=model.list();
		return list;
	}

}
