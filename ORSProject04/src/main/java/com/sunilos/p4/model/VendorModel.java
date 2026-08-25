package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.VendorBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class VendorModel extends BaseModel<VendorBean> {
	public long add(VendorBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		VendorBean existBean = findByVendorName(bean.getVendorName());

		if (existBean != null) {
			throw new DuplicateRecordException("Vendor Name already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getVendorName());
			pstmt.setString(3, bean.getMobileNo());

			pstmt.setString(4, bean.getAddress());
			pstmt.setString(5, bean.getServiceType());

			pstmt.setString(6, bean.getCreatedBy());
			pstmt.setString(7, bean.getModifiedBy());
			pstmt.setTimestamp(8, bean.getCreatedDatetime());
			pstmt.setTimestamp(9, bean.getModifiedDatetime());
			pstmt.executeUpdate();
			conn.commit(); // End transaction
			pstmt.close();
		} catch (Exception e) {
			log.error("Database Exception..", e);
			try {
				conn.rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new ApplicationException("Exception : add rollback exception " + ex.getMessage());
			}
			throw new ApplicationException("Exception : Exception in add Vendor ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public VendorBean findByVendorName(String vendorName) {

		return findByUniqueColumn("vendorName", vendorName);
	}

	@Override
	public void update(VendorBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		VendorBean existBean = findByVendorName(bean.getVendorName());

		// Check if updated College already exist
		System.out.println("existBean id: " + existBean.getId());
		System.out.println("bean id: " + bean.getId());
		if (existBean != null && existBean.getId() != bean.getId()) {

			throw new DuplicateRecordException("VendorName is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET VendorName=?,MobileNo=?,Address=?,ServiceType=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getVendorName());
			pstmt.setString(2, bean.getMobileNo());

			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getServiceType());

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
			throw new ApplicationException("Exception in updating Vendor ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");

	}

	@Override
	public String getWhereClause(VendorBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getVendorName() != null && bean.getVendorName().length() > 0) {
				sql.append(" AND vendorName like '" + bean.getVendorName() + "%'");
			}
			if (bean.getMobileNo() != null && bean.getMobileNo().length() > 0) {
				sql.append(" AND mobileNo like '" + bean.getMobileNo() + "%'");
			}
			if (bean.getAddress() != null && bean.getAddress().length() > 0) {
				sql.append(" AND address like '" + bean.getAddress() + "%'");
			}

			if (bean.getServiceType() != null && bean.getServiceType().length() > 0) {
				sql.append(" AND serviceType like '" + bean.getServiceType() + "%'");
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {

		return "st_vendor";
	}

	@Override
	public VendorBean getBean() {
		// TODO Auto-generated method stub
		return new VendorBean();
	}
}
