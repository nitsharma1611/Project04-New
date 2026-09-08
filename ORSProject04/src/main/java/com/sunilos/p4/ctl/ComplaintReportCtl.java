package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.ComplaintBean;
import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.model.ComplaintModel;
import com.sunilos.p4.model.EventModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/ComplaintReportCtl")
public class ComplaintReportCtl extends BaseReportCtl<ComplaintBean> {

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.COMPLAINT_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "COMPLAINT_LIST_COMPILED_REPORT";
	}

	@Override
	public List<ComplaintBean> getList() {
		ComplaintModel model=new ComplaintModel();
		List<ComplaintBean> list=model.list();
		
		return list;
	}

}
