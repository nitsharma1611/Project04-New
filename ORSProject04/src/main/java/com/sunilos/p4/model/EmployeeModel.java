package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.EmployeeBean;

import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class EmployeeModel extends BaseModel<EmployeeBean> {

	public long add(EmployeeBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		EmployeeBean existBean = findByName(bean.getName());

		if (existBean != null) {
			throw new DuplicateRecordException("Employee Name already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getName());
			pstmt.setDouble(3, bean.getSalary());

			pstmt.setString(4, bean.getDesignation());
			pstmt.setDate(5, new java.sql.Date(bean.getJoiningDate().getTime()));

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
			throw new ApplicationException("Exception : Exception in add Employee ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public EmployeeBean findByName(String name) {

		return findByUniqueColumn("name", name);
	}

	@Override
	public void update(EmployeeBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		EmployeeBean existBean = findByName(bean.getName());

		// Check if updated College already exist
		if (existBean != null && !(existBean.getId() == bean.getId())) {

			throw new DuplicateRecordException("EmployeeName is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET name=?,salary=?,designation=?,joiningDate=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getName());
			pstmt.setDouble(2, bean.getSalary());

			pstmt.setString(3, bean.getDesignation());
			pstmt.setDate(4, new java.sql.Date(bean.getJoiningDate().getTime()));

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
			throw new ApplicationException("Exception in updating Employee ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");

	}

	@Override
	public String getWhereClause(EmployeeBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getName() != null && bean.getName().length() > 0) {
				sql.append(" AND name like '" + bean.getName() + "%'");
			}
			if (bean.getSalary() != null && bean.getSalary() > 0) {
				sql.append(" AND salary = " + bean.getSalary());
			}
			if (bean.getDesignation() != null && bean.getDesignation().length() > 0) {
				sql.append(" AND designation like '" + bean.getDesignation() + "%'");
			}
			if (bean.getJoiningDate() != null && bean.getJoiningDate().getDate() > 0) {

				sql.append(" AND joiningDate = " + bean.getJoiningDate());
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {

		return "st_employee";
	}

	@Override
	public EmployeeBean getBean() {
		// TODO Auto-generated method stub
		return new EmployeeBean();
	}

}
