package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.DepartmentBean;
import com.sunilos.p4.bean.ExamBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.JDBCDataSource;

public class ExamModel extends BaseModel<ExamBean> {

	@Override
	public long add(ExamBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		ExamBean existBean = findByExamName(bean.getExamName());

		if (existBean != null) {
			throw new DuplicateRecordException("ExamName already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getExamName());
			pstmt.setDate(3, new java.sql.Date(bean.getExamDate().getTime()));
			pstmt.setInt(4, bean.getTotalMarks());
			pstmt.setInt(5, bean.getPassingMarks());
		

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
			throw new ApplicationException("Exception : Exception in add Exam ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	@Override
	public void update(ExamBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		ExamBean beanExist = findByExamName(bean.getExamName());

		// Check if updated College already exist
		if (beanExist != null && beanExist.getId() != bean.getId()) {

			throw new DuplicateRecordException("ExamName is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET examName=?,examDate=?,totalMarks=?,passingMarks=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getExamName());
			pstmt.setDate(2, new java.sql.Date(bean.getExamDate().getTime()));
			pstmt.setInt(3, bean.getTotalMarks());
			pstmt.setInt(4, bean.getPassingMarks());
		

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
			throw new ApplicationException("Exception in updating Department ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");
	
	}

	@Override
	public String getWhereClause(ExamBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getExamName() != null && bean.getExamName().length() > 0) {
				sql.append(" AND examName like '" + bean.getExamName() + "%'");
			}
			if (bean.getExamDate() != null) {
			    sql.append(" AND examDate = '" + DataUtility.getDateString(bean.getExamDate()) + "'");
			}
			if (bean.getTotalMarks()  > 0) {
				sql.append(" AND totalMarks = " + bean.getTotalMarks());
			}
			if (bean.getPassingMarks()  > 0) {
				sql.append(" AND passingMarks = " + bean.getPassingMarks());
			}
		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	public ExamBean findByExamName(String examName ) {
		// TODO Auto-generated method stub
		return findByUniqueColumn("examName", examName);
	}

	
	
	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "st_exam";
	}

	@Override
	public ExamBean getBean() {
		// TODO Auto-generated method stub
		return new ExamBean();
	}

}
