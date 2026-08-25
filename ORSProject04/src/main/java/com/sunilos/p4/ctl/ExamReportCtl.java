package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.ExamBean;
import com.sunilos.p4.model.ExamModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/ExamReportCtl")
public class ExamReportCtl extends BaseReportCtl<ExamBean>{

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.EXAM_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "EXAM_LIST_COMPILED_REPORT";
	}

	@Override
	public List<ExamBean> getList() {
		ExamModel model= new ExamModel();
		List<ExamBean> list=model.list();
		return list;
	}

}
