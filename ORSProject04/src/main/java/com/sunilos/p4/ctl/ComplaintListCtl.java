package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.ComplaintBean;
import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.model.ComplaintModel;
import com.sunilos.p4.model.EventModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/ComplaintListCtl")
public class ComplaintListCtl extends BaseListCtl<ComplaintBean, ComplaintModel> {
	@Override
	protected ComplaintBean populateBean(HttpServletRequest request) {
		ComplaintBean bean = new ComplaintBean();

		bean.setComplaintType(DataUtility.getString(request.getParameter("complaintType")));
		bean.setComplaintDate(DataUtility.getDate(request.getParameter("complaintDate")));

		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.COMPLAINT_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.COMPLAINT_LIST_VIEW;
	}

	@Override
	protected ComplaintModel getModel() {
		// TODO Auto-generated method stub
		return new ComplaintModel();
	}

}
