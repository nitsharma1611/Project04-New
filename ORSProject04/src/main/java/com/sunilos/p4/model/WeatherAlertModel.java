package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.sunilos.p4.bean.WeatherAlertBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class WeatherAlertModel extends BaseModel<WeatherAlertBean> {

	@Override
	public long add(WeatherAlertBean bean) throws ApplicationException, DuplicateRecordException {

		Connection conn = null;
		int pk = 0;

		WeatherAlertBean beanExist = findByAlertCode(bean.getAlertCode());

		// Check if updated College already exist
		if (beanExist != null) {

			throw new DuplicateRecordException("AlertCode is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?) ");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getAlertCode());
			pstmt.setString(3, bean.getCityName());
			pstmt.setDouble(4, bean.getTemperature());
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
			throw new ApplicationException("Exception : Exception in add Weather Alert");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");

		return pk;
	}

	@Override
	public void update(WeatherAlertBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;

		WeatherAlertBean beanExist = findByAlertCode(bean.getAlertCode());

		// Check if updated College already exist
		if (beanExist != null && beanExist.getId() != bean.getId()) {

			throw new DuplicateRecordException("AlertCode is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE weather_alert SET alertCode=?,cityName=?,temperature=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getAlertCode());
			pstmt.setString(2, bean.getCityName());
			pstmt.setDouble(3, bean.getTemperature());
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
			throw new ApplicationException("Exception in updating  ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
	}

	public WeatherAlertBean findByAlertCode(String alertCode) throws ApplicationException {

		return findByUniqueColumn("alertCode", alertCode);
	}

	@Override
	public String getWhereClause(WeatherAlertBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getAlertCode() != null && bean.getAlertCode().length() > 0) {
				sql.append(" AND alertCode like '" + bean.getAlertCode() + "%'");
			}
			if (bean.getCityName() != null && bean.getCityName().length() > 0) {
				sql.append(" AND cityName like '" + bean.getCityName() + "%'");
			}
			
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}

		}
		return sql.toString();

	}

	@Override
	public String getTable() {

		return "weather_alert";
	}

	@Override
	public WeatherAlertBean getBean() {

		return new WeatherAlertBean();
	}

}
