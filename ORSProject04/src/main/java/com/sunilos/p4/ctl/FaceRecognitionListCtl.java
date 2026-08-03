package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.FaceRecognitionBean;
import com.sunilos.p4.model.FaceRecognitionModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/FaceRecognitionListCtl")
public class FaceRecognitionListCtl extends BaseListCtl<FaceRecognitionBean, FaceRecognitionModel>{

	@Override
	protected String getView() {
	
		return ORSView.FACE_RECOGNITION_LIST_VIEW; }

	@Override
	protected String getView(String op) {
		
		return ORSView.FACE_RECOGNITION_LIST_VIEW;
	}

	@Override
	protected FaceRecognitionModel getModel() {
		// TODO Auto-generated method stub
		return new FaceRecognitionModel();
	}

	@Override
	protected FaceRecognitionBean populateBean(HttpServletRequest request) {
		FaceRecognitionBean bean = new FaceRecognitionBean();
		bean.setUserName(DataUtility.getString(request.getParameter("userName")));
		return bean;
	}

}
