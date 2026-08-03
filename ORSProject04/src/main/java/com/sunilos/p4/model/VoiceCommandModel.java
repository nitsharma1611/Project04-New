package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.VoiceCommandBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class VoiceCommandModel extends BaseModel<VoiceCommandBean> {

	@Override
	public long add(VoiceCommandBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;
		int pk = 0;
VoiceCommandBean existBean=findByCommandCode(bean.getCommandCode());
if(existBean!=null) {
	throw new DuplicateRecordException("CommandCode is already exist");
}
		
		
		
		
		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);

			pk = nextPK();
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT INTO " + getTable() + " VALUES (?,?,?,?,?,?,?,?,?) ");
			pstmt.setLong(1, pk);
			pstmt.setString(2, bean.getCommandCode());
			pstmt.setString(3, bean.getUserName());
			pstmt.setString(4, bean.getCommandText());
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
			throw new ApplicationException("Exception : Exception in add Voice Command");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return pk;
	}

	@Override
	public void update(VoiceCommandBean bean) throws ApplicationException, DuplicateRecordException {
		Connection conn = null;
		VoiceCommandBean existBean=findByCommandCode(bean.getCommandCode());
		if(existBean!=null && existBean.getId()!=bean.getId()) {
			throw new DuplicateRecordException("CommandCode is already exist");
		}
		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE "+getTable()+" SET commandCode=?,userName=?,commandText=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getCommandCode());
			pstmt.setString(2, bean.getUserName());
			pstmt.setString(3, bean.getCommandText());
			pstmt.setString(4, bean.getStatus());
			pstmt.setString(5, bean.getCreatedBy());
			pstmt.setString(6, bean.getModifiedBy());
			pstmt.setTimestamp(7, bean.getCreatedDatetime());
			pstmt.setTimestamp(8, bean.getModifiedDatetime());
			pstmt.setLong(9, bean.getId());
			int i=pstmt.executeUpdate();
			conn.commit(); // End transaction
			System.out.println("Update"+i);
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

	public VoiceCommandBean findByCommandCode(String commandCode) throws ApplicationException {

		return findByUniqueColumn("commandCode", commandCode);
	}

	@Override
	public String getWhereClause(VoiceCommandBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getCommandCode() != null && bean.getCommandCode().length() > 0) {
				sql.append(" AND commandCode like '" + bean.getCommandCode() + "%'");
			}
			if (bean.getUserName() != null && bean.getUserName().length() > 0) {
				sql.append(" AND userName like '" + bean.getUserName() + "%'");
			}

			if (bean.getCommandText() != null && bean.getCommandText().length() > 0) {
				sql.append(" AND commandText like '" + bean.getCommandText() + "%'");
			}
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}

		}
		return sql.toString();

	}

	@Override
	public String getTable() {

		return "voice_command";
	}

	@Override
	public VoiceCommandBean getBean() {

		return new VoiceCommandBean();
	}

}
