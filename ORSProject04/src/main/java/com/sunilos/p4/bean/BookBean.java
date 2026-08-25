package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookBean extends BaseBean  {
private String title;
private String author;
private Double price;
private Integer publicationYear;
	
	
	
	
	
	public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public Integer getPublicationYear() {
	return publicationYear;
}

public void setPublicationYear(Integer publicationYear) {
	this.publicationYear = publicationYear;
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
			this.setTitle(rs.getString(2));
			this.setAuthor(rs.getString(3));
			this.setPrice(rs.getDouble(4));
			this.setPublicationYear(rs.getInt(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
}
