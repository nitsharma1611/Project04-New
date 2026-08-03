package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.QRScannerBean;

import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class QRScannerModel extends BaseModel<QRScannerBean>{

	@Override
	public long add(QRScannerBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;
		int pk = 0;
		
		QRScannerBean existBean =findByQrCode(bean.getQrCode());
		if(existBean!=null) {
			throw new DuplicateRecordException("QR Code already exists");
		}
		
		
		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?) ");

			pstmt.setLong(1, pk);
			pstmt.setString(2, bean.getQrCode());
			pstmt.setString(3, bean.getScannedBy());
			pstmt.setDate(4,  new java.sql.Date(bean.getScanTime().getTime()));
			pstmt.setString(5, bean.getStatus());
			pstmt.setString(6, bean.getCreatedBy());
			pstmt.setString(7, bean.getModifiedBy());
			pstmt.setTimestamp(8, bean.getCreatedDatetime());
			pstmt.setTimestamp(9, bean.getModifiedDatetime());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Database Exception..", e);
			try {
				conn.rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new ApplicationException("Exception : add rollback exception " + ex.getMessage());
			}
			throw new ApplicationException("Exception : Exception in add QRScanner");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

		return pk + 1;
	}

	@Override
	public void update(QRScannerBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;

		QRScannerBean existBean =findByQrCode(bean.getQrCode());
		if(existBean!=null &&  existBean.getId()!=bean.getId()) {
			throw new DuplicateRecordException("Qr Code already exists");
		}
		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE "+ getTable() +" SET qrCode=?,scannedBy=?,scanTime=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getQrCode());
			pstmt.setString(2, bean.getScannedBy());
			pstmt.setDate(3, new java.sql.Date(bean.getScanTime().getTime()));
			pstmt.setString(4, bean.getStatus());
		pstmt.setString(5, bean.getCreatedBy());
			pstmt.setString(6, bean.getModifiedBy());
			pstmt.setTimestamp(7, bean.getCreatedDatetime());
			pstmt.setTimestamp(8, bean.getModifiedDatetime());
			pstmt.setLong(9, bean.getId());
			pstmt.executeUpdate();
			conn.commit(); // End transaction
			pstmt.close();
		} catch (Exception e) {
			log.error("Database Exception..", e);
			try {
				conn.rollback();
			} catch (Exception ex) {
				throw new ApplicationException("Exception : Delete rollback exception " + ex.getMessage());
			}
			throw new ApplicationException("Exception in updating QRScanner");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		
	}

	@Override
	public String getWhereClause(QRScannerBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getQrCode() != null && bean.getQrCode().length() > 0) {
				sql.append(" AND qrCode like '" + bean.getQrCode() + "%'");
			}
			if (bean.getScannedBy() != null && bean.getScannedBy().length() > 0) {
				sql.append(" AND scannedBy like '" + bean.getScannedBy() + "%'");
			}
			
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}

		}
		return sql.toString();
	}

	@Override
	public String getTable() {
		
		return "qr_scanner";
	}

	@Override
	public QRScannerBean getBean() {
		// TODO Auto-generated method stub
		return new QRScannerBean();
	}
	public QRScannerBean findByQrCode(String qrCode) throws ApplicationException {
		return findByUniqueColumn("qrCode", qrCode);
	}
}
