package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.DroneDeliveryBean;
import com.sunilos.p4.bean.SmartParkingBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class DroneDeliveryModel extends BaseModel<DroneDeliveryBean> {

	@Override
	public long add(DroneDeliveryBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;
		int pk = 0;
DroneDeliveryBean existBean=findByDroneCode(bean.getDroneCode());
if(existBean!=null) {
	throw new DuplicateRecordException("Drone Code already exists");
}
		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setLong(1, pk);
			pstmt.setString(2, bean.getDroneCode());
			pstmt.setString(3, bean.getOperatorName());
			pstmt.setString(4, bean.getDeliveryZone());
			pstmt.setString(5, bean.getStatus());
			pstmt.setString(6, bean.getCreatedBy());
			pstmt.setString(7, bean.getModifiedBy());
			pstmt.setTimestamp(8, bean.getCreatedDatetime());
			pstmt.setTimestamp(9, bean.getModifiedDatetime());
			int i=pstmt.executeUpdate();
			conn.commit();
			System.out.println(i);
			pstmt.close();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new ApplicationException("Exception : add rollback exception " + ex.getMessage());
			}
			throw new ApplicationException("Exception : Exception in add Drone Delivery");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

		return pk;
	}

	@Override
	public void update(DroneDeliveryBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;
		DroneDeliveryBean existBean=findByDroneCode(bean.getDroneCode());
		if(existBean!=null&& existBean.getId()!=bean.getId()) {
			throw new DuplicateRecordException("Drone Code already exists");
		}
		
		
		
		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET drone_code=?,operator_name=?,delivery_zone=?,Status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getDroneCode());
			pstmt.setString(2, bean.getOperatorName());
			pstmt.setString(3, bean.getDeliveryZone());
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

	public DroneDeliveryBean findByDroneCode(String droneCode) throws ApplicationException {
		return findByUniqueColumn("drone_code", droneCode);
	}

	@Override
	public String getWhereClause(DroneDeliveryBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getDroneCode() != null && bean.getDroneCode().length() > 0) {
				sql.append(" AND Drone_Code like '" + bean.getDroneCode() + "%'");
			}
			if (bean.getOperatorName() != null && bean.getOperatorName().length() > 0) {
				sql.append(" AND Operator_Name like '" + bean.getOperatorName() + "%'");
			}
			if (bean.getDeliveryZone() != null && bean.getDeliveryZone().length() > 0) {
				sql.append(" AND Delivery_Zone like '" + bean.getDeliveryZone() + "%'");
			}
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND Status like '" + bean.getStatus() + "%'");
			}
		}
		return sql.toString();
	}

	@Override
	public String getTable() {

		return "drone_delivery";
	}

	@Override
	public DroneDeliveryBean getBean() {

		return new DroneDeliveryBean();
	}

}
