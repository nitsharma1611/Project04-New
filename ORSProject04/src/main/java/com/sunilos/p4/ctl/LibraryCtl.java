package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.LibraryBean;

import com.sunilos.p4.model.LibraryModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/LibraryCtl")
public class LibraryCtl extends BaseCtl<LibraryBean, LibraryModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("libraryName"))) {
			request.setAttribute("libraryName", PropertyReader.getValue("error.require", "LibraryName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("address"))) {
			request.setAttribute("address", PropertyReader.getValue("error.require", "Address"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("totalBooks"))) {
			request.setAttribute("totalBooks", PropertyReader.getValue("error.require", "TotalBooks"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("contactNo"))) {
			request.setAttribute("contactNo", PropertyReader.getValue("error.require", "ContactNo"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected LibraryBean populateBean(HttpServletRequest request) {
		LibraryBean bean = new LibraryBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setLibraryName(DataUtility.getString(request.getParameter("libraryName")));

		bean.setAddress(DataUtility.getString(request.getParameter("address")));

		bean.setTotalBooks(DataUtility.getInt(request.getParameter("totalBooks")));
		bean.setContactNo(DataUtility.getString(request.getParameter("contactNo")));
		populateDTO(bean, request);

		return bean;

	}

	@Override
	protected String getView() {
		
		return ORSView.LIBRARY_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.LIBRARY_LIST_CTL;
		} else {
			return ORSView.LIBRARY_VIEW;
		}
	}

	@Override
	protected LibraryModel getModel() {
	
		return new LibraryModel();
	}

}
