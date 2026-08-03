package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.SmartLightBean;
import com.sunilos.p4.bean.WaterMonitoringBean;
import com.sunilos.p4.model.SmartLightModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/SmartLightCtl")
public class SmartLightCtl extends BaseCtl<SmartLightBean, SmartLightModel>{

	
	
	
	
	
	
	@Override
	protected boolean validate(HttpServletRequest request) {
		

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("lightCode"))) {
			request.setAttribute("lightCode", PropertyReader.getValue("error.require", "LightCode"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("roomName"))) {
			request.setAttribute("roomName", PropertyReader.getValue("error.require", "RoomName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("brightnessLevel"))) {
			request.setAttribute("brightnessLevel", PropertyReader.getValue("error.require", "BrightnessLevel"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}
		

	

		return pass;
	}

	@Override
	protected SmartLightBean populateBean(HttpServletRequest request) {
		

		SmartLightBean bean = new SmartLightBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setLightCode(DataUtility.getString(request.getParameter("lightCode")));

		bean.setRoomName(DataUtility.getString(request.getParameter("roomName")));

		bean.setBrightnessLevel(DataUtility.getInt(request.getParameter("brightnessLevel")));

		bean.setStatus(DataUtility.getString(request.getParameter("status")));

		
		populateDTO(bean, request);

	

		return bean;
	
	}

	@Override
	protected String getView() {
		
		return ORSView.SMART_LIGHT_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.SMART_LIGHT_LIST_CTL;
		} else {
			return ORSView.SMART_LIGHT_VIEW;
		}
	}

	@Override
	protected SmartLightModel getModel() {
		
		return new SmartLightModel();
	}

}
