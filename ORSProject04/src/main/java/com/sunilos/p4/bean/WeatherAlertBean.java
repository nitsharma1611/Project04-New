package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WeatherAlertBean extends BaseBean {
	private String alertCode;
	private String cityName;
	private Double temperature;
	private String status;

	public String getAlertCode() {
		return alertCode;
	}

	public void setAlertCode(String alertCode) {
		this.alertCode = alertCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getKey() {

		return "status";
	}

	@Override
	public String getValue() {

		return null;
	}

	@Override
	public void setResultset(ResultSet rs) {
		try {
			super.setResultset(rs);
			this.setAlertCode(rs.getString(2));
			this.setCityName(rs.getString(3));
			this.setTemperature(rs.getDouble(4));
			this.setStatus(rs.getString(5));

		} catch (SQLException e) {
e.printStackTrace();
		}

	}

}
