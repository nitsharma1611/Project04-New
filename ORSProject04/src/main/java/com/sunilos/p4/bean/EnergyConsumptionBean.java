package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EnergyConsumptionBean extends BaseBean {
private String energyCode;
private String deviceName;
private double unitsConsumed;
private String status;
public String getEnergyCode() {
	return energyCode;
}
public void setEnergyCode(String energyCode) {
	this.energyCode = energyCode;
}
public String getDeviceName() {
	return deviceName;
}
public void setDeviceName(String deviceName) {
	this.deviceName = deviceName;
}
public double getUnitsConsumed() {
	return unitsConsumed;
}
public void setUnitsConsumed(double unitsConsumed) {
	this.unitsConsumed = unitsConsumed;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String getKey() {
	
	return id+"";
}
@Override
public String getValue() {
	
	return status;
}
@Override
public void setResultset(ResultSet rs) {
	try {
		super.setResultset(rs);
		this.setEnergyCode(rs.getString(2));
		this.setDeviceName(rs.getString(3));
		this.setUnitsConsumed(rs.getDouble(4));
		this.setStatus(rs.getString(5));
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}


}
