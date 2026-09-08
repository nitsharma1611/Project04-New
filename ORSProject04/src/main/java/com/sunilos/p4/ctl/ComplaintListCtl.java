package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.ComplaintBean;
import com.sunilos.p4.model.ComplaintModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/ComplaintListCtl")
public class ComplaintListCtl extends BaseListCtl<ComplaintBean, ComplaintModel> {

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ComplaintModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
