package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.DoctorBean;
import com.sunilos.p4.bean.PatientBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class PatientModel extends BaseModel<PatientBean> {

	@Override
	public long add(PatientBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		PatientBean existBean = findByPatientName(bean.getPatientName());

		if (existBean != null) {
			throw new DuplicateRecordException("Patient already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getPatientName());
			pstmt.setString(3, bean.getDisease());
			pstmt.setString(4, bean.getDoctorName());
			pstmt.setDate(5, new java.sql.Date(bean.getAdmissionDate().getTime()));
		

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
			throw new ApplicationException("Exception : Exception in add Patient ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public PatientBean findByPatientName(String patientName) {

		return findByUniqueColumn("patientName", patientName);
	}

	@Override
	public void update(PatientBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		PatientBean existBean = findByPatientName(bean.getPatientName());

		// Check if updated College already exist
		if (existBean != null && existBean.getId() != bean.getId()) {

			throw new DuplicateRecordException("Patient is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET patientName=?,disease=?,doctorName=?,admissionDate=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getPatientName());
			pstmt.setString(2, bean.getDisease());
			pstmt.setString(3, bean.getDoctorName());
			pstmt.setDate(4,new java.sql.Date(bean.getAdmissionDate().getTime()));
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
			throw new ApplicationException("Exception in updating Patient");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");
	
	}

	
	@Override
	public String getWhereClause(PatientBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getDoctorName() != null && bean.getDoctorName().length() > 0) {
				sql.append(" AND doctorName like '" + bean.getDoctorName() + "%'");
			}
			if (bean.getDisease() != null && bean.getDisease().length() > 0) {
				sql.append(" AND disease like '" + bean.getDisease() + "%'");
			}
			if (bean.getPatientName() != null && bean.getPatientName().length() > 0) {
			    sql.append(" AND patientName like '" + bean.getPatientName() + "%'");
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}
	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "st_patient";
	}

	@Override
	public PatientBean getBean() {
		// TODO Auto-generated method stub
		return new PatientBean();
	}

}
