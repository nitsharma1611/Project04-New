package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.EnergyConsumptionBean;
import com.sunilos.p4.bean.SmartLightBean;
import com.sunilos.p4.model.EnergyConsumptionModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/EnergyConsumptionCtl")
public class EnergyConsumptionCtl extends BaseCtl<EnergyConsumptionBean, EnergyConsumptionModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("energyCode"))) {
			request.setAttribute("energyCode", PropertyReader.getValue("error.require", "EnergyCode"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("deviceName"))) {
			request.setAttribute("deviceName", PropertyReader.getValue("error.require", "DeviceName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("unitsConsumed"))) {
			request.setAttribute("brightnessLevel", PropertyReader.getValue("error.require", "UnitsConsumed"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected EnergyConsumptionBean populateBean(HttpServletRequest request) {

		EnergyConsumptionBean bean = new EnergyConsumptionBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setEnergyCode(DataUtility.getString(request.getParameter("energyCode")));

		bean.setDeviceName(DataUtility.getString(request.getParameter("deviceName")));

		bean.setUnitsConsumed(DataUtility.getDouble(request.getParameter("unitsConsumed")));

		bean.setStatus(DataUtility.getString(request.getParameter("status")));

		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.ENERGY_CONSUMPTION_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.ENERGY_CONSUMPTION_LIST_CTL;
		} else {
			return ORSView.ENERGY_CONSUMPTION_VIEW;
		}
	}

	@Override
	protected EnergyConsumptionModel getModel() {
		// TODO Auto-generated method stub
		return new EnergyConsumptionModel();
	}

}
