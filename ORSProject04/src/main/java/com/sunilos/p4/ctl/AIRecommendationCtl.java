package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.AIRecommendationBean;
import com.sunilos.p4.bean.EnergyConsumptionBean;
import com.sunilos.p4.model.AIRecommendationModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/AIRecommendationCtl")
public class AIRecommendationCtl extends BaseCtl<AIRecommendationBean, AIRecommendationModel> {

	
	
	
	
	
	@Override
	protected boolean validate(HttpServletRequest request) {

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("recommendationCode"))) {
			request.setAttribute("recommendationCode", PropertyReader.getValue("error.require", "RecommendationCode"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("userName"))) {
			request.setAttribute("userName", PropertyReader.getValue("error.require", "UserName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("recommendationType"))) {
			request.setAttribute("recommendationType", PropertyReader.getValue("error.require", "RecommendationType"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected AIRecommendationBean populateBean(HttpServletRequest request) {
		AIRecommendationBean bean = new AIRecommendationBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setRecommendationCode(DataUtility.getString(request.getParameter("recommendationCode")));

		bean.setUserName(DataUtility.getString(request.getParameter("userName")));

		bean.setRecommendationType(DataUtility.getString(request.getParameter("recommendationType")));

		bean.setStatus(DataUtility.getString(request.getParameter("status")));

		populateDTO(bean, request);

		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.AI_RECOMMENDATION_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.AI_RECOMMENDATION_LIST_CTL;
		} else {
			return ORSView.AI_RECOMMENDATION_VIEW;
		}
	}

	@Override
	protected AIRecommendationModel getModel() {
		// TODO Auto-generated method stub
		return new AIRecommendationModel();
	}

}
