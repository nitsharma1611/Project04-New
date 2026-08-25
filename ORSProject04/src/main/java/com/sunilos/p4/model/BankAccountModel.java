package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.bean.UserBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class BankAccountModel extends BaseModel<BankAccountBean>{
	public long add(BankAccountBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		BankAccountBean existBean = findByAccountNumber(bean.getAccountNumber());

		if (existBean != null) {
			throw new DuplicateRecordException("BankAccount already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getAccountNumber());
			pstmt.setString(3, bean.getAccountHolderName());
			
			pstmt.setString(4, bean.getAccountType());
			pstmt.setDouble(5, bean.getBalance());
			pstmt.setString(6, bean.getBranchName());

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
			throw new ApplicationException("Exception : Exception in add BankAccount ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public BankAccountBean findByAccountNumber(String accountNumber) {

		return findByUniqueColumn("accountNumber", accountNumber);
	}

	@Override
	public void update(BankAccountBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		BankAccountBean beanExist = findByAccountNumber(bean.getAccountNumber());
		// Check if updated LoginId already exist
		if (beanExist != null && !(beanExist.getId() == bean.getId())) {
			throw new DuplicateRecordException("AccountNumber is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET accountNumber=?,accountHolderName=?,accountType=?,balance=?,branchName=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getAccountNumber());
			pstmt.setString(2, bean.getAccountHolderName());
			
			pstmt.setString(3, bean.getAccountType());
			pstmt.setDouble(4, bean.getBalance());
			pstmt.setString(5, bean.getBranchName());
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
			throw new ApplicationException("Exception in updating BankAccount ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");
	
	}

	
	@Override
	public String getWhereClause(BankAccountBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getAccountNumber() != null && bean.getAccountNumber().length() > 0) {
				sql.append(" AND accountNumber like '" + bean.getAccountNumber() + "%'");
			}
			if (bean.getAccountHolderName() != null && bean.getAccountHolderName().length() > 0) {
				sql.append(" AND accountHolderName like '" + bean.getAccountHolderName() + "%'");
			}
			if (bean.getAccountType() != null && bean.getAccountType().length() > 0) {
			    sql.append(" AND accountType like '" + bean.getAccountType() + "%'");
			}

			if (bean.getBranchName() != null && bean.getBranchName().length() > 0) {
			    sql.append(" AND branchName like '" + bean.getBranchName() + "%'");
			}

			if (bean.getBalance() != null && bean.getBalance()> 0) {
			    sql.append(" AND balance = " + bean.getBalance());
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {
		
		return "st_bank_account";
	}

	@Override
	public BankAccountBean getBean() {
		// TODO Auto-generated method stub
		return new BankAccountBean();
	}
}
