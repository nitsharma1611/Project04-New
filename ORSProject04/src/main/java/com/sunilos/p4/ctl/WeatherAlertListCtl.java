package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.WeatherAlertBean;
import com.sunilos.p4.model.WeatherAlertModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/WeatherAlertListCtl")
public class WeatherAlertListCtl extends BaseListCtl<WeatherAlertBean, WeatherAlertModel> {

	
	
	
	
	@Override
	protected String getView() {
		
		return ORSView.WEATHERALERT_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		
		return ORSView.WEATHERALERT_LIST_VIEW;
	}

	@Override
	protected WeatherAlertModel getModel() {
		
		return new WeatherAlertModel();
	}

	@Override
	protected WeatherAlertBean populateBean(HttpServletRequest request) {
		WeatherAlertBean bean=new WeatherAlertBean();
		
		bean.setCityName(DataUtility.getString(request.getParameter("cityName")));
		bean.setStatus(DataUtility.getString(request.getParameter("status")));
		
		return bean;
	}
 
}
