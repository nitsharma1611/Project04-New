package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.SmartLightBean;

import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class SmartLightModel extends BaseModel<SmartLightBean> {

	@Override
	public long add(SmartLightBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		SmartLightBean existName = findByLightCode(bean.getLightCode());

		if (existName != null) {
			throw new DuplicateRecordException("LightCode already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO "+ getTable() +" VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getLightCode());
			pstmt.setString(3, bean.getRoomName());
			pstmt.setInt(4, bean.getBrightnessLevel());
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
			throw new ApplicationException("Exception : Exception in add SmartLight ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public SmartLightBean findByLightCode(String lightCode) {
		
		return findByUniqueColumn("lightCode", lightCode);
	}

	@Override
	public void update(SmartLightBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		SmartLightBean beanExist = findByLightCode(bean.getLightCode());

		// Check if updated College already exist
		if (beanExist != null && beanExist.getId() != bean.getId()) {

			throw new DuplicateRecordException("LightCode is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE "+ getTable() +" SET lightCode=?,roomName=?,brightnessLevel=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getLightCode());
			pstmt.setString(2, bean.getRoomName());
			pstmt.setInt(3, bean.getBrightnessLevel());
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
			throw new ApplicationException("Exception in updating SmartLight ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");	

	}

	@Override
	public String getWhereClause(SmartLightBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getLightCode() != null && bean.getLightCode().length() > 0) {
				sql.append(" AND lightCode like '" + bean.getLightCode() + "%'");
			}
			if (bean.getRoomName() != null && bean.getRoomName().length() > 0) {
				sql.append(" AND roomName like '" + bean.getRoomName() + "%'");
			}
			if (bean.getBrightnessLevel()>0) {
			    sql.append(" AND brightnessLevel = " + bean.getBrightnessLevel());
			}
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}
			

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {
		
		return "smart_light";
	}

	@Override
	public SmartLightBean getBean() {
	
		return new SmartLightBean();
	}

}
