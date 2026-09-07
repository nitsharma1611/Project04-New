package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.EmployeeBean;
import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.model.EmployeeModel;
import com.sunilos.p4.model.EventModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/EventCtl")
public class EventCtl extends BaseCtl<EventBean, EventModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		String eventDate = request.getParameter("eventDate");

		if (DataValidator.isNull(request.getParameter("eventName"))) {
			request.setAttribute("eventName", PropertyReader.getValue("error.require", "EventName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("venue"))) {
			request.setAttribute("venue", PropertyReader.getValue("error.require", "Venue"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("organizer"))) {
			request.setAttribute("organizer", PropertyReader.getValue("error.require", "organizer"));
			pass = false;
		}

		if (DataValidator.isNull(eventDate)) {
			request.setAttribute("eventDate", PropertyReader.getValue("error.require", "EventDate"));
			pass = false;
		} else if (!DataValidator.isDate(eventDate)) {
			request.setAttribute("eventDate", PropertyReader.getValue("error.date", "EventDate"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected EventBean populateBean(HttpServletRequest request) {
		EventBean bean = new EventBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setEventName(DataUtility.getString(request.getParameter("eventName")));
		bean.setEventDate(DataUtility.getDate(request.getParameter("eventDate")));
		bean.setVenue(DataUtility.getString(request.getParameter("venue")));

		bean.setOrganizer(DataUtility.getString(request.getParameter("organizer")));

		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.EVENT_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.EVENT_LIST_CTL;
		} else {
			return ORSView.EVENT_VIEW;
		}
	}

	@Override
	protected EventModel getModel() {
		// TODO Auto-generated method stub
		return new EventModel();
	}

}
