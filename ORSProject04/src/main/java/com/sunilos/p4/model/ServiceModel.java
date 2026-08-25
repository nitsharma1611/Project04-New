package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.ServiceBean;
import com.sunilos.p4.bean.VendorBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class ServiceModel extends BaseModel<ServiceBean>{

	public long add(ServiceBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		ServiceBean existBean = findByServiceName(bean.getServiceName());

		if (existBean != null) {
			throw new DuplicateRecordException("Service Name already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getServiceName());
			pstmt.setDouble(3, bean.getPrice());

			pstmt.setString(4, bean.getDescription());
			pstmt.setString(5, bean.getServiceCategory());

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
			throw new ApplicationException("Exception : Exception in add Service ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public ServiceBean findByServiceName(String serviceName) {

		return findByUniqueColumn("serviceName", serviceName);
	}

	@Override
	public void update(ServiceBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		ServiceBean existBean = findByServiceName(bean.getServiceName());

		// Check if updated College already exist
		if (existBean != null && !(existBean.getId() == bean.getId())) {

			throw new DuplicateRecordException("ServiceName is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET serviceName=?,price=?,description=?,serviceCategory=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getServiceName());
			pstmt.setDouble(2, bean.getPrice());

			pstmt.setString(3, bean.getDescription());
			pstmt.setString(4, bean.getServiceCategory());

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
			throw new ApplicationException("Exception in updating Service ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");

	}

	@Override
	public String getWhereClause(ServiceBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getServiceName() != null && bean.getServiceName().length() > 0) {
				sql.append(" AND serviceName like '" + bean.getServiceName() + "%'");
			}
			if (bean.getPrice() != null && bean.getPrice() > 0) {
			    sql.append(" AND price = " + bean.getPrice());
			}
			if (bean.getDescription() != null && bean.getDescription().length() > 0) {
				sql.append(" AND description like '" + bean.getDescription() + "%'");
			}

			if (bean.getServiceCategory() != null && bean.getServiceCategory().length() > 0) {
				sql.append(" AND serviceCategory like '" + bean.getServiceCategory() + "%'");
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {

		return "st_service";
	}

	@Override
	public ServiceBean getBean() {
		// TODO Auto-generated method stub
		return new ServiceBean();
	}

}
