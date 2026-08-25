package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.bean.VehicleBean;
import com.sunilos.p4.model.VehicleModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/VehicleCtl")
public class VehicleCtl  extends BaseCtl<VehicleBean,VehicleModel>{
	@Override
	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("vehicleName"))) {
			request.setAttribute("vehicleName", PropertyReader.getValue("error.require", "VehicleName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("modelName"))) {
			request.setAttribute("modelName", PropertyReader.getValue("error.require", "ModelName"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("color"))) {
			request.setAttribute("color", PropertyReader.getValue("error.require", "Color"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("price"))) {
			request.setAttribute("price", PropertyReader.getValue("error.require", "Price"));
			pass = false;
		}
		

		return pass;
	}

	@Override
	protected VehicleBean populateBean(HttpServletRequest request) {
		VehicleBean bean = new VehicleBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setVehicleName(DataUtility.getString(request.getParameter("vehicleName")));

		bean.setModelName(DataUtility.getString(request.getParameter("model")));
		
		bean.setColor(DataUtility.getString(request.getParameter("color")));

		bean.setPrice(DataUtility.getDouble(request.getParameter("price")));
		
		
		populateDTO(bean, request);

	

		return bean;

	}
	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.VEHICLE_VIEW;
	}

	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.VEHICLE_LIST_CTL;
		} else {
			return ORSView.VEHICLE_VIEW;
		}
	}


	@Override
	protected VehicleModel getModel() {
		// TODO Auto-generated method stub
		return new VehicleModel();
	}

}
