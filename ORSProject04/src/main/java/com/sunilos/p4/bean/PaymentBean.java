package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PaymentBean extends BaseBean {
private Double amount;
private Date paymentDate;
private String paymentmethod;
private String transactionId;
	
	
	
	
	public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public Date getPaymentDate() {
	return paymentDate;
}

public void setPaymentDate(Date paymentDate) {
	this.paymentDate = paymentDate;
}

public String getPaymentmethod() {
	return paymentmethod;
}

public void setPaymentmethod(String paymentmethod) {
	this.paymentmethod = paymentmethod;
}

public String getTransactionId() {
	return transactionId;
}

public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
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
			this.setAmount(rs.getDouble(2));
			this.setPaymentDate(rs.getDate(3));
			this.setPaymentmethod(rs.getString(4));
			this.setTransactionId(rs.getString(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
