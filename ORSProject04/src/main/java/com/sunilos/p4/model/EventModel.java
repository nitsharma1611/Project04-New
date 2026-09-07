package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.EmployeeBean;
import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class EventModel extends BaseModel<EventBean> {
	public long add(EventBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		EventBean existBean = findByEventName(bean.getEventName());

		if (existBean != null) {
			throw new DuplicateRecordException("Event Name already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + getTable() + " VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getEventName());
			pstmt.setDate(3, new java.sql.Date(bean.getEventDate().getTime()));
			pstmt.setString(4, bean.getVenue());
			pstmt.setString(5, bean.getOrganizer());
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
			throw new ApplicationException("Exception : Exception in add Employee ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;

	}

	public EventBean findByEventName(String eventName) {

		return findByUniqueColumn("eventName", eventName);
	}

	@Override
	public void update(EventBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		EventBean existBean = findByEventName(bean.getEventName());

		// Check if updated College already exist
		if (existBean != null && !(existBean.getId() == bean.getId())) {

			throw new DuplicateRecordException("EventName is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("UPDATE " + getTable()
					+ " SET eventName=?,eventDate=?,venue=?,organizer=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getEventName());
			pstmt.setDate(2, new java.sql.Date(bean.getEventDate().getTime()));
			pstmt.setString(3, bean.getVenue());
			pstmt.setString(4, bean.getOrganizer());

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
			throw new ApplicationException("Exception in updating Event ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");

	}

	@Override
	public String getWhereClause(EventBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getEventName() != null && bean.getEventName().length() > 0) {
				sql.append(" AND eventName like '" + bean.getEventName() + "%'");
			}
			if (bean.getVenue() != null && bean.getVenue().length() > 0) {
				sql.append(" AND venue like '" + bean.getVenue() + "%'");
			}
			if (bean.getOrganizer() != null && bean.getOrganizer().length() > 0) {
				sql.append(" AND organizer like '" + bean.getOrganizer() + "%'");
			}
			if (bean.getEventDate() != null && bean.getEventDate().getDate() > 0) {

				sql.append(" AND eventDate = " + bean.getEventDate());
			}

		}
		System.out.println(sql.toString());
		return sql.toString();

	}

	@Override
	public String getTable() {

		return "st_event";
	}

	@Override
	public EventBean getBean() {
		// TODO Auto-generated method stub
		return new EventBean();
	}
}
