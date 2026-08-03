package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.VoiceCommandBean;
import com.sunilos.p4.model.VoiceCommandModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/VoiceCommandCtl")
public class VoiceCommandCtl extends BaseCtl<VoiceCommandBean, VoiceCommandModel>{

	@Override
	protected String getView() {
		
		return ORSView.VOICE_COMMAND_VIEW;
	}

	@Override
	protected String getView(String op) {
		
		return ORSView.VOICE_COMMAND_VIEW;
	}

	@Override
	protected VoiceCommandModel getModel() {
		
		return new VoiceCommandModel();
	}

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("commandCode"))) {
			request.setAttribute("commandCode", PropertyReader.getValue("error.require", "commandCode"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("userName"))) {
			request.setAttribute("userNamer", PropertyReader.getValue("error.require", "userName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("commandText"))) {
			request.setAttribute("commandText", PropertyReader.getValue("error.require", "commandText"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "status"));
			pass = false;
		}
		
return pass;
		
	}

	@Override
	protected VoiceCommandBean populateBean(HttpServletRequest request) {
		VoiceCommandBean bean=new VoiceCommandBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setCommandCode(DataUtility.getString(request.getParameter("commandCode")));
		bean.setUserName(DataUtility.getString(request.getParameter("userName")));
		bean.setCommandText(DataUtility.getString(request.getParameter("commandText")));
		bean.setStatus(DataUtility.getString(request.getParameter("status")));
		populateDTO(bean, request);
return bean;
	}

}
