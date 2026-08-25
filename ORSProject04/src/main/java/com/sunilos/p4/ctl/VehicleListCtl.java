package com.sunilos.p4.ctl;

import com.sunilos.p4.bean.VehicleBean;
import com.sunilos.p4.model.VehicleModel;
import com.sunilos.p4.util.DataUtility;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/ctl/VehicleListCtl")
public class VehicleListCtl extends BaseListCtl<VehicleBean, VehicleModel>{

	
	
	
	
	@Override
	protected VehicleBean populateBean(HttpServletRequest request) {
		VehicleBean bean=new VehicleBean();
		bean.setVehicleName(DataUtility.getString(request.getParameter("vehicleName")));

	
		return bean;
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.VEHICLE_LIST_VIEW;
	}

	@Override
	protected String getView(String op) {
		// TODO Auto-generated method stub
		return ORSView.VEHICLE_LIST_VIEW;
	}

	@Override
	protected VehicleModel getModel() {
		// TODO Auto-generated method stub
		return new VehicleModel();
	}

}
