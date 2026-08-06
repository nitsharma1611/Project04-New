package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.AIRecommendationBean;
import com.sunilos.p4.bean.DepartmentBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class DepartmentModel extends BaseModel<DepartmentBean> {

	@Override
	public long add(DepartmentBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		DepartmentBean existBean = findByDepartmentName(bean.getDepartmentName());

		if (existBean != null) {
			throw new DuplicateRecordException("DepartmentName already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getDepartmentName());
			pstmt.setString(3, bean.getHodName());
			pstmt.setInt(4, bean.getTotalFaculty());
			pstmt.setString(5, bean.getLocation());
			pstmt.setString(6, bean.getStatus());

			pstmt.setString(7, bean.getCreatedBy());
			pstmt.setString(8, bean.getModifiedBy());
			pstmt.setTimestamp(9, bean.getCreatedDatetime());
			pstmt.setTimestamp(10, bean.getModifiedDatetime());
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
			throw new ApplicationException("Exception : Exception in add Department ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;
	}

	@Override
	public void update(DepartmentBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		DepartmentBean beanExist = findByDepartmentName(bean.getDepartmentName());

		// Check if updated College already exist
		if (beanExist != null && beanExist.getId() != bean.getId()) {

			throw new DuplicateRecordException("DepartmentName is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET departmentName=?,hodName=?,totalFaculty=?,location=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getDepartmentName());
			pstmt.setString(2, bean.getHodName());
			pstmt.setInt(3, bean.getTotalFaculty());
			pstmt.setString(4, bean.getLocation());
			pstmt.setString(5, bean.getStatus());
			pstmt.setString(6, bean.getCreatedBy());
			pstmt.setString(7, bean.getModifiedBy());
			pstmt.setTimestamp(8, bean.getCreatedDatetime());
			pstmt.setTimestamp(9, bean.getModifiedDatetime());
			pstmt.setLong(10, bean.getId());
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
	public String getWhereClause(DepartmentBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getDepartmentName() != null && bean.getDepartmentName().length() > 0) {
				sql.append(" AND departmentName like '" + bean.getDepartmentName() + "%'");
			}
			if (bean.getHodName() != null && bean.getHodName().length() > 0) {
				sql.append(" AND hodName like '" + bean.getHodName() + "%'");
			}
			if (bean.getLocation() != null && bean.getLocation().length() > 0) {
				sql.append(" AND location like '" + bean.getLocation() + "%'");
			}
			if (bean.getTotalFaculty() > 0) {
				sql.append(" AND totalFaculty = " + bean.getTotalFaculty());
			}
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}

		}
		System.out.println(sql.toString());
		return sql.toString();
	}

	public DepartmentBean findByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return findByUniqueColumn("departmentName", departmentName);
	}

	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "department";
	}

	@Override
	public DepartmentBean getBean() {
		// TODO Auto-generated method stub
		return new DepartmentBean();
	}

}
