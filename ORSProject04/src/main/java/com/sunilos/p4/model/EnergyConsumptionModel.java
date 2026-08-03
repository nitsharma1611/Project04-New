package com.sunilos.p4.model;


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.EnergyConsumptionBean;
import com.sunilos.p4.bean.SmartLightBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class EnergyConsumptionModel extends BaseModel<EnergyConsumptionBean> {

	@Override
	public long add(EnergyConsumptionBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		EnergyConsumptionBean existName = findByEnergyCode(bean.getEnergyCode());

		if (existName != null) {
			throw new DuplicateRecordException("EnergyCode already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO "+ getTable() +" VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getEnergyCode());
			pstmt.setString(3, bean.getDeviceName());
			pstmt.setDouble(4, bean.getUnitsConsumed());
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
			throw new ApplicationException("Exception : Exception in add EnergyCode ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;
	}

	

	@Override
	public void update(EnergyConsumptionBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		EnergyConsumptionBean beanExist = findByEnergyCode(bean.getEnergyCode());

		// Check if updated College already exist
		if (beanExist != null && beanExist.getId() != bean.getId()) {

			throw new DuplicateRecordException("EnergyCode is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE "+ getTable() +" SET energyCode=?,deviceName=?,unitsConsumed=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getEnergyCode());
			pstmt.setString(2, bean.getDeviceName());
			pstmt.setDouble(3, bean.getUnitsConsumed());
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
			throw new ApplicationException("Exception in updating EnergyCode ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");	
		
	}

	@Override
	public String getWhereClause(EnergyConsumptionBean bean) {
		
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getEnergyCode() != null && bean.getEnergyCode().length() > 0) {
				sql.append(" AND energyCode like '" + bean.getEnergyCode() + "%'");
			}
			if (bean.getDeviceName() != null && bean.getDeviceName().length() > 0) {
				sql.append(" AND deviceName like '" + bean.getDeviceName() + "%'");
			}
			if (bean.getUnitsConsumed()>0) {
			    sql.append(" AND unitsConsumed = " + bean.getUnitsConsumed());
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
		// TODO Auto-generated method stub
		return "energy_consumption";
	}

	@Override
	public EnergyConsumptionBean getBean() {
		return new EnergyConsumptionBean() ;
	}
public EnergyConsumptionBean findByEnergyCode(String energyCode) {
		
		return findByUniqueColumn("energyCode", energyCode);
	}
}
