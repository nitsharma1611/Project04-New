package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryBean  extends BaseBean{
private String libraryName;
private String address;
private Integer totalBooks;
private String contactNo;
public String getLibraryName() {
	return libraryName;
}
public void setLibraryName(String libraryName) {
	this.libraryName = libraryName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Integer getTotalBooks() {
	return totalBooks;
}
public void setTotalBooks(Integer totalBooks) {
	this.totalBooks = totalBooks;
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
this.setLibraryName(rs.getString(2));
this.setAddress(rs.getString(3));
this.setTotalBooks(rs.getInt(4));
this.setContactNo(rs.getString(5));
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
}




}
