package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.SmartLightBean;
import com.sunilos.p4.model.SmartLightModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/SmartLightListCtl")
public class SmartLightListCtl extends BaseListCtl<SmartLightBean, SmartLightModel> {

	@Override
	protected String getView() {
		
		return ORSView.SMART_LIGHT_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
	
		return ORSView.SMART_LIGHT_LIST_VIEW;
	}

	@Override
	protected SmartLightModel getModel() {
		
		return new SmartLightModel();
	}

	@Override
	protected SmartLightBean populateBean(HttpServletRequest request) {
		SmartLightBean bean = new SmartLightBean();
		bean.setLightCode(DataUtility.getString(request.getParameter("lightCode")));

		bean.setRoomName(DataUtility.getString(request.getParameter("roomName")));
		return bean;
	}

}
