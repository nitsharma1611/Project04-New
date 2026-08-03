package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.VoiceCommandBean;
import com.sunilos.p4.model.VoiceCommandModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/VoiceCommandListCtl")
public class VoiceCommandListCtl extends BaseListCtl<VoiceCommandBean, VoiceCommandModel> {

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.VOICE_COMMAND_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.VOICE_COMMAND_LIST_VIEW;
	}

	@Override
	protected VoiceCommandModel getModel() {
		
		return new VoiceCommandModel();
	}

	@Override
	protected VoiceCommandBean populateBean(HttpServletRequest request) {
VoiceCommandBean bean=new VoiceCommandBean();
		bean.setCommandCode(DataUtility.getString(request.getParameter("commandCode")));
		bean.setUserName(DataUtility.getString(request.getParameter("userName")));
		
		return bean;
		
	}
	

}
