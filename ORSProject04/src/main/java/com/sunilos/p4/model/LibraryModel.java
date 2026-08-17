package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.DoctorBean;
import com.sunilos.p4.bean.LibraryBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class LibraryModel extends BaseModel<LibraryBean> {
	@Override
	public long add(LibraryBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		LibraryBean existBean = findByLibraryName(bean.getLibraryName());

		if (existBean != null) {
			throw new DuplicateRecordException("Library already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getLibraryName());
			pstmt.setString(3, bean.getAddress());
			pstmt.setInt(4, bean.getTotalBooks());
			pstmt.setString(5, bean.getContactNo());
		

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
			throw new ApplicationException("Exception : Exception in add Library ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public LibraryBean findByLibraryName(String libraryName) {

		return findByUniqueColumn("libraryName", libraryName);
	}

	@Override
	public void update(LibraryBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		LibraryBean beanExist = findByLibraryName(bean.getLibraryName());

		// Check if updated College already exist
		if (beanExist != null && !(beanExist.getId() == bean.getId())) {

			throw new DuplicateRecordException("Library is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET libraryName=?,address=?,totalBooks=?,contactNo=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getLibraryName());
			pstmt.setString(2, bean.getAddress());
			pstmt.setInt(3, bean.getTotalBooks());
			pstmt.setString(4, bean.getContactNo());
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
			throw new ApplicationException("Exception in updating Library ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");
	
	}

	
	@Override
	public String getWhereClause(LibraryBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getLibraryName() != null && bean.getLibraryName().length() > 0) {
				sql.append(" AND libraryName like '" + bean.getLibraryName() + "%'");
			}
			if (bean.getAddress() != null && bean.getAddress().length() > 0) {
				sql.append(" AND address like '" + bean.getAddress() + "%'");
			}
			if (bean.getTotalBooks() != null && bean.getTotalBooks() > 0) {
			    sql.append(" AND totalBooks = " + bean.getTotalBooks());
			}

			if (bean.getContactNo() != null && bean.getContactNo().length() > 0) {
			    sql.append(" AND contactNo = " + bean.getContactNo());
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {
		
		return "st_library";
	}

	@Override
	public LibraryBean getBean() {
		// TODO Auto-generated method stub
		return new LibraryBean();
	}

}
