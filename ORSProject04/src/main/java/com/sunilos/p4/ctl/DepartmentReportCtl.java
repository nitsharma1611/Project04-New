package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.DepartmentBean;
import com.sunilos.p4.model.DepartmentModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/DepartmentReportCtl")
public class DepartmentReportCtl extends BaseReportCtl<DepartmentBean> {

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return ORSView.DEPARTMENT_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "DEPARTMENT_LIST_COMPILED_REPORT";
	}

	@Override
	public List<DepartmentBean> getList() {
	DepartmentModel model=new DepartmentModel();
	List<DepartmentBean> list=model.list();
		return list;
	}

}
