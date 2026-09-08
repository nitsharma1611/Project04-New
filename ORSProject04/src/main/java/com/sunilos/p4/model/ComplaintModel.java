package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.ComplaintBean;

import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class ComplaintModel extends BaseModel<ComplaintBean> {
	public long add(ComplaintBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		ComplaintBean existBean = findByComplaintType(bean.getComplaintType());

		if (existBean != null) {
			throw new DuplicateRecordException("Complaint Type already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getComplaintType());
			pstmt.setString(3, bean.getDescription());
			pstmt.setDate(4, new java.sql.Date(bean.getComplaintDate().getTime()));
			
			pstmt.setString(5, bean.getStatus());
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
			throw new ApplicationException("Exception : Exception in add Complaint ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public ComplaintBean findByComplaintType(String complaintType) {

		return findByUniqueColumn("complaintType", complaintType);
	}

	@Override
	public void update(ComplaintBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		ComplaintBean existBean = findByComplaintType(bean.getComplaintType());

		// Check if updated College already exist
		if (existBean != null && !(existBean.getId() == bean.getId())) {

			throw new DuplicateRecordException("Complaint Type is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET complaintType=?,description=?,complaintDate=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getComplaintType());
			pstmt.setString(2, bean.getDescription());
			pstmt.setDate(3, new java.sql.Date(bean.getComplaintDate().getTime()));
			
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
			throw new ApplicationException("Exception in updating Complaint ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");

	}

	@Override
	public String getWhereClause(ComplaintBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getComplaintType() != null && bean.getComplaintType().length() > 0) {
				sql.append(" AND complaintType like '" + bean.getComplaintType() + "%'");
			}
			if (bean.getDescription() != null && bean.getDescription().length() > 0) {
				sql.append(" AND description like '" + bean.getDescription() + "%'");
			}
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}
			if (bean.getComplaintDate() != null && bean.getComplaintDate().getDate() > 0) {

				sql.append(" AND complaintDate = " + bean.getComplaintDate());
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {

		return "st_complaint";
	}

	@Override
	public ComplaintBean getBean() {
		// TODO Auto-generated method stub
		return new ComplaintBean();
	}
}
