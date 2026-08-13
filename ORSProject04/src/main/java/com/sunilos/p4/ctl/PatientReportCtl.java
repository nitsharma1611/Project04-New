package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.PatientBean;
import com.sunilos.p4.model.PatientModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/PatientReportCtl")
public class PatientReportCtl  extends BaseReportCtl<PatientBean>{

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.PATIENT_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "PATIENT_LIST_COMPILED_REPORT";
	}

	@Override
	public List<PatientBean> getList() {
		PatientModel model=new PatientModel();
		List<PatientBean> list=model.list();
		
		return list;
	}

}
