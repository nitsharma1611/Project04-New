package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.AIRecommendationBean;
import com.sunilos.p4.model.AIRecommendationModel;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ctl/AIRecommendationReportCtl")
public class AIRecommendationReportCtl extends BaseReportCtl<AIRecommendationBean>{

	@Override
	public String getView() {
		
		return ORSView.AI_RECOMMENDATION_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		// TODO Auto-generated method stub
		return "AI_RECOMMENDATION_LIST_COMPILED_REPORT";
	}

	@Override
	public List<AIRecommendationBean> getList() {
		AIRecommendationModel model=new AIRecommendationModel();
		List<AIRecommendationBean> list=model.list();
		return list;
	}

}
