package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.EnergyConsumptionBean;
import com.sunilos.p4.model.EnergyConsumptionModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.ServletUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/EnergyConsumptionListCtl")
public class EnergyConsumptionListCtl extends BaseListCtl<EnergyConsumptionBean, EnergyConsumptionModel> {

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.ENERGY_CONSUMPTION_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.ENERGY_CONSUMPTION_LIST_VIEW;
	}

	@Override
	protected EnergyConsumptionModel getModel() {
		// TODO Auto-generated method stub
		return new EnergyConsumptionModel();
	}

	@Override
	protected EnergyConsumptionBean populateBean(HttpServletRequest request) {
		EnergyConsumptionBean bean = new EnergyConsumptionBean();

		bean.setEnergyCode(DataUtility.getString(request.getParameter("energyCode")));
bean.setDeviceName(DataUtility.getString(request.getParameter("deviceName")));

		return bean;
	}

}
