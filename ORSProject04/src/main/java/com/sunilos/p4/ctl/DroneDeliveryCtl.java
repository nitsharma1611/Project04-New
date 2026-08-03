package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.DroneDeliveryBean;
import com.sunilos.p4.model.DroneDeliveryModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;
import com.sunilos.p4.util.ServletUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/DroneDeliveryCtl")
public class DroneDeliveryCtl extends BaseCtl<DroneDeliveryBean, DroneDeliveryModel> {

	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;
		if (DataValidator.isNull(request.getParameter("droneCode"))) {
			request.setAttribute("droneCode", PropertyReader.getValue("error.require", "DroneCode"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("operatorName"))) {
			request.setAttribute("operatorName", PropertyReader.getValue("error.require", "OperatorName"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("deliveryZone"))) {
			request.setAttribute("deliveryZone", PropertyReader.getValue("error.require", "DeliveryZone"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "Status"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected DroneDeliveryBean populateBean(HttpServletRequest request) {
		DroneDeliveryBean bean = new DroneDeliveryBean();
		bean.setId(DataUtility.getLong(request.getParameter("id")));
		bean.setDroneCode(DataUtility.getString(request.getParameter("droneCode")));
		bean.setOperatorName(DataUtility.getString(request.getParameter("operatorName")));
		bean.setDeliveryZone(DataUtility.getString(request.getParameter("deliveryZone")));
		bean.setStatus(DataUtility.getString(request.getParameter("status")));
		populateDTO(bean, request);
		System.out.println(bean);
		
		return bean;
	}

	@Override
	protected String getView() {

		return ORSView.DRONE_DELIVERY_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.DRONE_DELIVERY_LIST_CTL;
		} else {
			return ORSView.DRONE_DELIVERY_VIEW;
		}
	}

	@Override
	protected DroneDeliveryModel getModel() {

		return new DroneDeliveryModel();
	}

}
