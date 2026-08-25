package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunilos.p4.bean.BaseBean;

public class VehicleBean extends BaseBean {
	private String vehicleName;
	private String modelName;
	private String color;
	private double price;

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResultset(ResultSet rs) {
		try {
			super.setResultset(rs);
			this.setVehicleName(rs.getString(2));
			this.setModelName(rs.getString(3));
			this.setColor(rs.getString(4));
			this.setPrice(rs.getDouble(5));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
