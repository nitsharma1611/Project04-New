package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ComplaintBean extends BaseBean{
private String  complaintType;
private String description;
private Date complaintDate;
private String status;
public String getComplaintType() {
	return complaintType;
}
public void setComplaintType(String complaintType) {
	this.complaintType = complaintType;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getComplaintDate() {
	return complaintDate;
}
public void setComplaintDate(Date complaintDate) {
	this.complaintDate = complaintDate;
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
	return id+"";
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
		this.setComplaintType(rs.getString(2));
		this.setDescription(rs.getString(3));
		this.setComplaintDate(rs.getDate(4));
		this.setStatus(rs.getString(5));
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}


}
