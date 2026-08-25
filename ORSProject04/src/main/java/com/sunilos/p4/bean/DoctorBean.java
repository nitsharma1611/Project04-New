package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorBean extends BaseBean {
	private String doctorName;
	private String specialization;
	private Integer experience;
	private String contactNo;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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
			this.setDoctorName(rs.getString(2));
			this.setSpecialization(rs.getString(3));
			this.setExperience(rs.getInt(4));
			this.setContactNo(rs.getString(5));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
