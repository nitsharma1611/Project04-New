package com.sunilos.p4.ctl;

import java.io.IOException;

import com.sunilos.p4.bean.BookBean;
import com.sunilos.p4.model.BookModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ctl/BookListCtl")
public class BookListCtl extends BaseListCtl<BookBean, BookModel> {

	@Override
	protected BookBean populateBean(HttpServletRequest request) {
		BookBean bean = new BookBean();

		bean.setTitle(DataUtility.getString(request.getParameter("title")));

		bean.setAuthor(DataUtility.getString(request.getParameter("author")));
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.BOOK_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.BOOK_LIST_VIEW;
	}

	@Override
	protected BookModel getModel() {
		// TODO Auto-generated method stub
		return new BookModel();
	}

}
