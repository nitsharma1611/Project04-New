package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.bean.ExamBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.JDBCDataSource;

import net.sf.jasperreports.components.barcode4j.RoyalMailCustomerComponent;

public class CustomerModel extends BaseModel<CustomerBean>{

	@Override
	public long add(CustomerBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		CustomerBean existBean = findByEmail(bean.getEmail());

		if (existBean != null) {
			throw new DuplicateRecordException("CustomerEmail already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getCustomerName());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getPhoneNumber());
			pstmt.setString(5, bean.getAddress());
		

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
			throw new ApplicationException("Exception : Exception in add Customer ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	@Override
	public void update(CustomerBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		CustomerBean beanExist = findByEmail(bean.getEmail());

		// Check if updated College already exist
		if (beanExist != null && beanExist.getId() != bean.getId()) {

			throw new DuplicateRecordException("CustomerEmail is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET customerName=?,email=?,phoneNumber=?,address=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getCustomerName());
			pstmt.setString(2,bean.getEmail());
			pstmt.setString(3, bean.getPhoneNumber());
			pstmt.setString(4, bean.getAddress());
		

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
			throw new ApplicationException("Exception in updating Customer ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");
	
	}
	public CustomerBean findByEmail(String email) {
		
		return findByUniqueColumn("email", email);
	}
	

	@Override
	public String getWhereClause(CustomerBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getCustomerName() != null && bean.getCustomerName().length() > 0) {
				sql.append(" AND customerName like '" + bean.getCustomerName() + "%'");
			}
			if (bean.getEmail() != null && bean.getEmail().length() > 0) {
				sql.append(" AND email like '" + bean.getEmail() + "%'");
			}
			if (bean.getPhoneNumber() != null && bean.getPhoneNumber().length() > 0) {
				sql.append(" AND phoneNumber like '" + bean.getPhoneNumber() + "%'");
			}
			if (bean.getAddress() != null && bean.getAddress().length() > 0) {
				sql.append(" AND address like '" + bean.getAddress() + "%'");
			}
			
		}
		System.out.println(sql.toString());
		return sql.toString();

	}


	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "st_customer";
	}

	@Override
	public CustomerBean getBean() {
		// TODO Auto-generated method stub
		return new CustomerBean();
	}

	
	
}
