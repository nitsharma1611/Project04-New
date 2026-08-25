package com.sunilos.p4.bean;

import java.sql.ResultSet;

public class VendorBean extends BaseBean {
private String vendorName;
private String mobileNo;
private String address;
private String serviceType;
	
	
	
	
	public String getVendorName() {
	return vendorName;
}

public void setVendorName(String vendorName) {
	this.vendorName = vendorName;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getServiceType() {
	return serviceType;
}

public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
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
		// TODO Auto-generated method stub
		
		try {
			super.setResultset(rs);
			this.setVendorName(rs.getString(2));
			this.setMobileNo(rs.getString(3));
			this.setAddress(rs.getString(4));
			this.setServiceType(rs.getString(5));
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
		
	}

}
