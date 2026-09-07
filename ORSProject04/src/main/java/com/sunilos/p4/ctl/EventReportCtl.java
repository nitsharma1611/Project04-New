package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.EmployeeBean;
import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.model.EmployeeModel;
import com.sunilos.p4.model.EventModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/EventReportCtl")
public class EventReportCtl extends BaseReportCtl<EventBean>{

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.EVENT_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "EVENT_LIST_COMPILED_REPORT";
	}

	@Override
	public List<EventBean> getList() {
		EventModel model=new EventModel();
		List<EventBean> list=model.list();
		
		return list;
	}

}
