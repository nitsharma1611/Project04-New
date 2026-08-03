package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.WeatherAlertBean;
import com.sunilos.p4.model.WeatherAlertModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;
import com.sunilos.p4.util.ServletUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
@WebServlet("/ctl/WeatherAlertCtl")
public class WeatherAlertCtl extends BaseCtl<WeatherAlertBean, WeatherAlertModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;
		if (DataValidator.isNull(request.getParameter("alertCode"))) {
			request.setAttribute("alertCode", PropertyReader.getValue("error.require", "AlertCode"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("cityName"))) {
			request.setAttribute("cityName", PropertyReader.getValue("error.require", "CityName"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("temperature"))) {
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected WeatherAlertBean populateBean(HttpServletRequest request) {
		WeatherAlertBean bean=new WeatherAlertBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setAlertCode(DataUtility.getString(request.getParameter("alertCode")));
		bean.setCityName(DataUtility.getString(request.getParameter("cityName")));
		bean.setTemperature(DataUtility.getDouble(request.getParameter("temperature")));
		bean.setStatus(DataUtility.getString(request.getParameter("status")));
		
		populateDTO(bean, request);
		return bean;
	}

	@Override
	protected String getView() {

		return ORSView.WEATHERALERT_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.WEATHERALERT_LIST_CTL;
		} else {
			return ORSView.WEATHERALERT_VIEW;
		}
	}

	@Override
	protected WeatherAlertModel getModel() {

		return new WeatherAlertModel();
	}

}
