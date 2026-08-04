package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.AIRecommendationBean;
import com.sunilos.p4.model.AIRecommendationModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/AIRecommendationListCtl")
public class AIRecommendationListCtl extends BaseListCtl<AIRecommendationBean, AIRecommendationModel> {

	@Override
	protected String getView() {
		
		return ORSView.AI_RECOMMENDATION_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		
		return ORSView.AI_RECOMMENDATION_LIST_VIEW;
	}

	@Override
	protected AIRecommendationModel getModel() {
		// TODO Auto-generated method stub
		return new AIRecommendationModel();
	}

	@Override
	protected AIRecommendationBean populateBean(HttpServletRequest request) {
		
		AIRecommendationBean bean=new AIRecommendationBean();
		bean.setRecommendationCode(DataUtility.getString(request.getParameter("recommendationCode")));

		bean.setUserName(DataUtility.getString(request.getParameter("userName")));
		bean.setStatus(DataUtility.getString(request.getParameter("status")));
		return bean;
	}

}
