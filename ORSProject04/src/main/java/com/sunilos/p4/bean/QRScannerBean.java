package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class QRScannerBean extends BaseBean {
	private String qrCode;
	private String scannedBy;
	private Date scanTime;
	private String status;

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return id + " ";
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
	this.setQrCode(rs.getString(2));
	this.setScannedBy(rs.getString(3));
	this.setScanTime(rs.getDate(4));
	this.setStatus(rs.getString(5));
} catch (SQLException e) {
	e.printStackTrace();
}
	
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getScannedBy() {
		return scannedBy;
	}

	public void setScannedBy(String scannedBy) {
		this.scannedBy = scannedBy;
	}

	public Date getScanTime() {
		return scanTime;
	}

	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
