package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.model.EventModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/EventListCtl")
public class EventListCtl extends BaseListCtl<EventBean, EventModel> {

	@Override
	protected EventBean populateBean(HttpServletRequest request) {
		EventBean bean = new EventBean();

		bean.setEventName(DataUtility.getString(request.getParameter("eventName")));

		bean.setVenue(DataUtility.getString(request.getParameter("venue")));

		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.EVENT_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.EVENT_LIST_VIEW;
	}

	@Override
	protected EventModel getModel() {
		// TODO Auto-generated method stub
		return new EventModel();
	}

}
