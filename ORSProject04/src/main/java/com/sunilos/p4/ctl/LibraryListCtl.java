package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.LibraryBean;

import com.sunilos.p4.model.LibraryModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/LibraryListCtl")
public class LibraryListCtl extends BaseListCtl<LibraryBean, LibraryModel>{
	@Override
	protected LibraryBean populateBean(HttpServletRequest request) {
		LibraryBean bean = new LibraryBean();

		bean.setLibraryName(DataUtility.getString(request.getParameter("libraryName")));

		bean.setAddress(DataUtility.getString(request.getParameter("address")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.LIBRARY_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.LIBRARY_LIST_VIEW;
	}

	@Override
	protected LibraryModel getModel() {
		// TODO Auto-generated method stub
		return new LibraryModel();
	}


}
