package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.BookBean;
import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.model.BookModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/BookCtl")
public class BookCtl extends BaseCtl<BookBean, BookModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("title"))) {
			request.setAttribute("title", PropertyReader.getValue("error.require", "Title"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("author"))) {
			request.setAttribute("author", PropertyReader.getValue("error.require", "Author"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("price"))) {
			request.setAttribute("price", PropertyReader.getValue("error.require", "Price"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("publicationYear"))) {
			request.setAttribute("publicationYear", PropertyReader.getValue("error.require", "PublicationYear"));
			pass = false;
		}
		

		return pass;
	}

	@Override
	protected BookBean populateBean(HttpServletRequest request) {
		BookBean bean = new BookBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setTitle(DataUtility.getString(request.getParameter("title")));

		bean.setAuthor(DataUtility.getString(request.getParameter("author")));
		
		bean.setPrice(DataUtility.getDouble(request.getParameter("price")));

		bean.setPublicationYear(DataUtility.getInt(request.getParameter("publicationYear")));
		
		
		populateDTO(bean, request);

	

		return bean;

	}
	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.BOOK_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.BOOK_LIST_CTL;
		} else {
			return ORSView.BOOK_VIEW;
		}
	}

	
	
		@Override
	protected BookModel getModel() {
		// TODO Auto-generated method stub
		return new BookModel();
	}

}
