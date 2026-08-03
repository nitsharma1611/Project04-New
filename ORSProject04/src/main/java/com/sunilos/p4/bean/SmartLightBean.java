package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SmartLightBean extends BaseBean {

	private String lightCode;
	private String roomName;
	private int brightnessLevel;
	private String status;

	public String getLightCode() {
		return lightCode;
	}

	public void setLightCode(String lightCode) {
		this.lightCode = lightCode;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getBrightnessLevel() {
		return brightnessLevel;
	}

	public void setBrightnessLevel(int brightnessLevel) {
		this.brightnessLevel = brightnessLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getKey() {

		return id + " ";
	}

	@Override
	public String getValue() {

		return "status";
	}

	@Override
	public void setResultset(ResultSet rs) {
		try {

			super.setResultset(rs);
			this.setLightCode(rs.getString(2));
			this.setRoomName(rs.getString(3));
			this.setBrightnessLevel(rs.getInt(4));
			this.setStatus(rs.getString(5));

			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
