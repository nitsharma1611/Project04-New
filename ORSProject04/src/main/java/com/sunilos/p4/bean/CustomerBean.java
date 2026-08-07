package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerBean  extends BaseBean{

	private String  customerName;
	private String email;
	private String phoneNumber;
	private String address;
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		this.setCustomerName(rs.getString(2));
		this.setEmail(rs.getString(3));
		this.setPhoneNumber(rs.getString(4));
		this.setAddress(rs.getString(5));
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}

	
	
	
	
}
