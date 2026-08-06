package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.ExamBean;
import com.sunilos.p4.bean.SmartLightBean;
import com.sunilos.p4.model.ExamModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/ExamCtl")
public class ExamCtl extends BaseCtl<ExamBean, ExamModel> {

	
	
	
	
	
	
	
	
	@Override
	protected boolean validate(HttpServletRequest request) {

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("examName"))) {
			request.setAttribute("examName", PropertyReader.getValue("error.require", "ExamName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("examDate"))) {
			request.setAttribute("examDate", PropertyReader.getValue("error.require", "ExamDate"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("totalMarks"))) {
			request.setAttribute("totalMarks", PropertyReader.getValue("error.require", "TotalMarks"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("passingMarks"))) {
			request.setAttribute("passingMarks", PropertyReader.getValue("error.require", "PassingMarks"));
			pass = false;
		}
		

	

		return pass;
	}

	@Override
	protected ExamBean populateBean(HttpServletRequest request) {
		ExamBean bean = new ExamBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setExamName(DataUtility.getString(request.getParameter("examName")));

		bean.setExamDate(DataUtility.getDate(request.getParameter("examDate")));

		bean.setTotalMarks(DataUtility.getInt(request.getParameter("totalMarks")));

		bean.setPassingMarks(DataUtility.getInt(request.getParameter("passingMarks")));

		
		populateDTO(bean, request);

	

		return bean;
	
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.EXAM_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.EXAM_LIST_CTL;
		} else {
			return ORSView.EXAM_VIEW;
		}
	}

	@Override
	protected ExamModel getModel() {
		return new ExamModel() ;
	}

}
