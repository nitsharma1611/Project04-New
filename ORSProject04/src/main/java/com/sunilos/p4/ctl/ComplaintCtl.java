package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.ComplaintBean;
import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.model.ComplaintModel;
import com.sunilos.p4.model.EventModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/ComplaintCtl")
public class ComplaintCtl extends BaseCtl<ComplaintBean, ComplaintModel>{

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		String complaintDate = request.getParameter("complaintDate");

		if (DataValidator.isNull(request.getParameter("complaintType"))) {
			request.setAttribute("complaintType", PropertyReader.getValue("error.require", "ComplaintType"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("description"))) {
			request.setAttribute("description", PropertyReader.getValue("error.require", "Description"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}

		if (DataValidator.isNull(complaintDate)) {
			request.setAttribute("complaintDate", PropertyReader.getValue("error.require", "ComplaintDate"));
			pass = false;
		} else if (!DataValidator.isDate(complaintDate)) {
			request.setAttribute("complaintDate", PropertyReader.getValue("error.date", "ComplaintDate"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected ComplaintBean populateBean(HttpServletRequest request) {
		ComplaintBean bean = new ComplaintBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setComplaintType(DataUtility.getString(request.getParameter("complaintType")));
		bean.setComplaintDate(DataUtility.getDate(request.getParameter("complaintDate")));
		bean.setDescription(DataUtility.getString(request.getParameter("description")));

		bean.setStatus(DataUtility.getString(request.getParameter("status")));

		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.COMPLAINT_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.COMPLAINT_LIST_CTL;
		} else {
			return ORSView.COMPLAINT_VIEW;
		}
	}

	@Override
	protected ComplaintModel getModel() {
		// TODO Auto-generated method stub
		return new ComplaintModel();
	}

}
