package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.LibraryBean;
import com.sunilos.p4.model.LibraryModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/LibraryReportCtl")
public class LibraryReportCtl extends BaseReportCtl<LibraryBean> {

	@Override
	public String getView() {
		
		return ORSView.LIBRARY_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "LIBRARY_LIST_COMPILED_REPORT";
	}

	@Override
	public List<LibraryBean> getList() {
		LibraryModel model=new LibraryModel();
		List<LibraryBean> list=model.list();
		
		return list;
	}

}
