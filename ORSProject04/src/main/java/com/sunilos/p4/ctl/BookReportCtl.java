package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.BookBean;
import com.sunilos.p4.model.BookModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/BookReportCtl")
public class BookReportCtl extends BaseReportCtl<BookBean> {

	@Override
	public String getView() {
		
		return ORSView.BOOK_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "BOOK_LIST_COMPILED_REPORT";
	}

	@Override
	public List<BookBean> getList() {
		BookModel model=new  BookModel();
		List<BookBean> list=model.list();
		return list;
	}

}
