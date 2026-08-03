package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WaterMonitoringBean extends BaseBean {
	private String waterCode;
	private String location;
	private double waterLevel;
	private String status;

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return id+ " ";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return status;
	}

	public String getWaterCode() {
		return waterCode;
	}

	public void setWaterCode(String waterCode) {
		this.waterCode = waterCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getWaterLevel() {
		return waterLevel;
	}

	public void setWaterLevel(double waterLevel) {
		this.waterLevel = waterLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void setResultset(ResultSet rs) {
		try {

			super.setResultset(rs);
			this.setWaterCode(rs.getString(2));
			this.setLocation(rs.getString(3));
			this.setWaterLevel(rs.getDouble(4));
			this.setStatus(rs.getString(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
