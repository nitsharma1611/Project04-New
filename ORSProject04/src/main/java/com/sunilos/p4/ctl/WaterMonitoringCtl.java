package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.CollegeBean;
import com.sunilos.p4.bean.WaterMonitoringBean;
import com.sunilos.p4.model.WaterMonitoringModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/WaterMonitoringCtl")
public class WaterMonitoringCtl extends BaseCtl<WaterMonitoringBean, WaterMonitoringModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
	

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("waterCode"))) {
			request.setAttribute("waterCode", PropertyReader.getValue("error.require", "waterCode"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("location"))) {
			request.setAttribute("location", PropertyReader.getValue("error.require", "Location"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("waterLevel"))) {
			request.setAttribute("waterLevel", PropertyReader.getValue("error.require", "WaterLevel"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}
		

	

		return pass;
	}

	@Override
	protected WaterMonitoringBean populateBean(HttpServletRequest request) {
		

		WaterMonitoringBean bean = new WaterMonitoringBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setWaterCode(DataUtility.getString(request.getParameter("waterCode")));

		bean.setLocation(DataUtility.getString(request.getParameter("location")));

		bean.setWaterLevel(DataUtility.getDouble(request.getParameter("waterLevel")));

		bean.setStatus(DataUtility.getString(request.getParameter("status")));

		
		populateDTO(bean, request);

	

		return bean;
	}

	@Override
	protected String getView() {

		return ORSView.WATER_MONITORING_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.WATER_MONITORING_LIST_CTL;
		} else {
			return ORSView.WATER_MONITORING_VIEW;
		}

	}

	@Override
	protected WaterMonitoringModel getModel() {

		return new WaterMonitoringModel();
	}

}
