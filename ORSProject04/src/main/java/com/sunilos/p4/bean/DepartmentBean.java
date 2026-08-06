package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentBean extends BaseBean {

	private String departmentName;
	private String hodName;
	private int totalFaculty;
	private String location;
	private String status;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public int getTotalFaculty() {
		return totalFaculty;
	}

	public void setTotalFaculty(int totalFaculty) {
		this.totalFaculty = totalFaculty;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return id + "";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public void setResultset(ResultSet rs) {
		try {

			super.setResultset(rs);
			this.setDepartmentName(rs.getString(2));
			this.setHodName(rs.getString(3));
			this.setTotalFaculty(rs.getInt(4));
			this.setLocation(rs.getString(5));
			this.setStatus(rs.getString(6));
		} catch (SQLException e) {
e.printStackTrace();
		}
	}

	
}
