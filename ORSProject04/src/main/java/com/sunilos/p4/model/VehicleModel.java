package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.SmartParkingBean;
import com.sunilos.p4.bean.VehicleBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class VehicleModel extends BaseModel<VehicleBean> {

	@Override
	public long add(VehicleBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;
		int pk = 0;
		
		VehicleBean existBean =findByVehicleName(bean.getVehicleName());
		if(existBean!=null) {
			throw new DuplicateRecordException("Vehicle Name already exists");
		}
		
		
		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?) ");

			pstmt.setLong(1, pk);
			pstmt.setString(2, bean.getVehicleName());
			pstmt.setString(3, bean.getModelName());
			pstmt.setString(4, bean.getColor());
			pstmt.setDouble(5, bean.getPrice());
			pstmt.setString(6, bean.getCreatedBy());
			pstmt.setString(7, bean.getModifiedBy());
			pstmt.setTimestamp(8, bean.getCreatedDatetime());
			pstmt.setTimestamp(9, bean.getModifiedDatetime());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Database Exception..", e);
			try {
				conn.rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new ApplicationException("Exception : add rollback exception " + ex.getMessage());
			}
			throw new ApplicationException("Exception : Exception in add Vehicle");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

		return pk + 1;
	}

	@Override
	public void update(VehicleBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;

		VehicleBean existBean =findByVehicleName(bean.getVehicleName());
		if(existBean!=null &&  existBean.getId()!=bean.getId()) {
			throw new DuplicateRecordException("VehicleName already exists");
		}
		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE "+ getTable() +" SET vehicleName=?,modelName=?,color=?,price=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getVehicleName());
			pstmt.setString(2, bean.getModelName());
			pstmt.setString(3, bean.getColor());
			pstmt.setDouble(4, bean.getPrice());
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
			throw new ApplicationException("Exception in updating VehicleName");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
	}

	public VehicleBean findByVehicleName(String vehicleName) throws ApplicationException {
		return findByUniqueColumn("vehicleName",vehicleName );
	}

	@Override
	public String getWhereClause(VehicleBean bean) {

		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getVehicleName() != null && bean.getVehicleName().length() > 0) {
				sql.append(" AND vehicleName like '" + bean.getVehicleName() + "%'");
			}
			if (bean.getModelName() != null && bean.getModelName().length() > 0) {
				sql.append(" AND modelName like '" + bean.getModelName() + "%'");
			}
			if (bean.getColor() != null && bean.getColor().length() > 0) {
				sql.append(" AND color like '" + bean.getColor() + "%'");
			}
			if (bean.getPrice() > 0) {
				sql.append(" AND price = " + bean.getPrice());
			}
		}
		return sql.toString();
	}


	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return "st_vehicle";
	}

	@Override
	public VehicleBean getBean() {
		// TODO Auto-generated method stub
		return new VehicleBean();
	}

}
