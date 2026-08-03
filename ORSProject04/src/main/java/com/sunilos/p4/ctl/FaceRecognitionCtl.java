package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.FaceRecognitionBean;
import com.sunilos.p4.model.FaceRecognitionModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
@WebServlet("/ctl/FaceRecognitionCtl")
public class FaceRecognitionCtl extends BaseCtl<FaceRecognitionBean, FaceRecognitionModel> {

	@Override
	protected String getView() {

		return ORSView.FACE_RECOGNITION_VIEW;
	}

	@Override
	protected String getView(String op) {

		return ORSView.FACE_RECOGNITION_VIEW;
	}

	@Override
	protected FaceRecognitionModel getModel() {

		return new FaceRecognitionModel();
	}

	@Override
	protected boolean validate(HttpServletRequest request) {

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("faceCode"))) {
			request.setAttribute("faceCode", PropertyReader.getValue("error.require", "FaceCode"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("userName"))) {
			request.setAttribute("userName", PropertyReader.getValue("error.require", "UserName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("Status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("imagePath"))) {
			request.setAttribute("imagePath", PropertyReader.getValue("error.require", "ImagePath"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected FaceRecognitionBean populateBean(HttpServletRequest request) {
		FaceRecognitionBean bean = new FaceRecognitionBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setFaceCode(DataUtility.getString(request.getParameter("faceCode")));

		bean.setUserName(DataUtility.getString(request.getParameter("userName")));

		bean.setStatus(DataUtility.getString(request.getParameter("status")));

		bean.setImagePath(DataUtility.getString(request.getParameter("imagePath")));

		populateDTO(bean, request);

		return bean;
	}

}
