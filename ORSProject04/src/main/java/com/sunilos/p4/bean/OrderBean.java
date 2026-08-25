package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class OrderBean extends BaseBean {
	private Date orderDate;
	private Double amount;
	private String status;
	private long customerId;

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
this.setOrderDate(rs.getDate(2));
this.setAmount(rs.getDouble(3));
this.setStatus(rs.getString(4));
this.setCustomerId(rs.getLong(5));
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
