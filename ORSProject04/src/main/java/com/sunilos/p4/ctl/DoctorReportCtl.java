package com.sunilos.p4.ctl;

import java.util.List;


import com.sunilos.p4.bean.DoctorBean;

import com.sunilos.p4.model.DoctorModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/DoctorReportCtl")
public class DoctorReportCtl extends BaseReportCtl<DoctorBean> {

	@Override
	public String getView() {
		
		return ORSView.DOCTOR_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "DOCTOR_LIST_COMPILED_REPORT";
	}

	@Override
	public List<DoctorBean> getList() {
		DoctorModel model=new  DoctorModel();
		List<DoctorBean> list=model.list();
		return list;
	}

	

}
