package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.FaceRecognitionBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class FaceRecognitionModel extends BaseModel<FaceRecognitionBean> {

	@Override
	public long add(FaceRecognitionBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		FaceRecognitionBean existBean = findByFaceCode(bean.getFaceCode());

		if (existBean != null) {
			throw new DuplicateRecordException("existBean FaceCode already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getFaceCode());
			pstmt.setString(3, bean.getUserName());
			pstmt.setString(4, bean.getImagePath());
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
			throw new ApplicationException("Exception : Exception in add Face Recognition ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	@Override
	public void update(FaceRecognitionBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		FaceRecognitionBean existBean = findByFaceCode(bean.getFaceCode());

		if (existBean != null && existBean.getId() != bean.getId()) {
			throw new DuplicateRecordException("existBean FaceCode already exists");
		}
		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET faceCode=?,userName=?,imagePath=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getFaceCode());
			pstmt.setString(2, bean.getUserName());
			pstmt.setString(3, bean.getImagePath());
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
			throw new ApplicationException("Exception in updating FaceRecognition ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");
	}

	@Override
	public String getWhereClause(FaceRecognitionBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getFaceCode() != null && bean.getFaceCode().length() > 0) {
				sql.append(" AND faceCode like '" + bean.getFaceCode() + "%'");
			}
			if (bean.getUserName() != null && bean.getUserName().length() > 0) {
				sql.append(" AND userName like '" + bean.getUserName() + "%'");
			}
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}

			if (bean.getImagePath() != null && bean.getImagePath().length() > 0) {
				sql.append(" AND imagePath = " + bean.getImagePath());
			}

		}
		return sql.toString();
	}

	@Override
	public String getTable() {

		return "face_recognition";
	}

	@Override
	public FaceRecognitionBean getBean() {

		return new FaceRecognitionBean();
	}

	public FaceRecognitionBean findByFaceCode(String faceCode) throws ApplicationException {
		return findByUniqueColumn("faceCode", faceCode);
	}
}
