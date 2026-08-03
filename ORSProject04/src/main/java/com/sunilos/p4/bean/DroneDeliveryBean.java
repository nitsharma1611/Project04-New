package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DroneDeliveryBean extends BaseBean {
	private String droneCode;
	private String operatorName;
	private String deliveryZone;
	private String status;

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

	public String getDroneCode() {
		return droneCode;
	}

	public void setDroneCode(String droneCode) {
		this.droneCode = droneCode;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getDeliveryZone() {
		return deliveryZone;
	}

	public void setDeliveryZone(String deliveryZone) {
		this.deliveryZone = deliveryZone;
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
			this.setDroneCode(rs.getString(2));
			this.setOperatorName(rs.getString(3));
			this.setDeliveryZone(rs.getString(4));
			this.setStatus(rs.getString(5));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
