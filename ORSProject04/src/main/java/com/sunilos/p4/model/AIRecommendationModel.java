package com.sunilos.p4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunilos.p4.bean.AIRecommendationBean;
import com.sunilos.p4.bean.EnergyConsumptionBean;
import com.sunilos.p4.exception.ApplicationException;
import com.sunilos.p4.exception.DuplicateRecordException;
import com.sunilos.p4.util.JDBCDataSource;

public class AIRecommendationModel extends BaseModel<AIRecommendationBean> {

	@Override
	public long add(AIRecommendationBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model add Started");
		Connection conn = null;
		int pk = 0;

		AIRecommendationBean existBean = findByRecommendationCode(bean.getRecommendationCode());

		if (existBean != null) {
			throw new DuplicateRecordException("RecommendationCode already exists");
		}

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPK();
			// Get auto-generated next primary key
			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO "+ getTable() +" VALUES(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getRecommendationCode());
			pstmt.setString(3, bean.getUserName());
			pstmt.setString(4, bean.getRecommendationType());
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
			throw new ApplicationException("Exception : Exception in add RecommendationCode ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model add End");
		return pk;
	}

	
	@Override
	public void update(AIRecommendationBean bean) throws ApplicationException, DuplicateRecordException {
		log.debug("Model update Started");
		Connection conn = null;

		AIRecommendationBean beanExist = findByRecommendationCode(bean.getRecommendationCode());

		// Check if updated College already exist
		if (beanExist != null && beanExist.getId() != bean.getId()) {

			throw new DuplicateRecordException("RecommendationCode is already exist");
		}

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false); // Begin transaction
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE "+ getTable() +" SET recommendationCode=?,userName=?,recommendationType=?,status=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			pstmt.setString(1, bean.getRecommendationCode());
			pstmt.setString(2, bean.getUserName());
			pstmt.setString(3, bean.getRecommendationType());
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
			throw new ApplicationException("Exception in updating recommendationCode ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		log.debug("Model update End");	
		
		
	}

	@Override
	public String getWhereClause(AIRecommendationBean bean) {
		StringBuffer sql = new StringBuffer();

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getRecommendationCode() != null && bean.getRecommendationCode().length() > 0) {
				sql.append(" AND recommendationCode like '" + bean.getRecommendationCode() + "%'");
			}
			if (bean.getUserName() != null && bean.getUserName().length() > 0) {
				sql.append(" AND userName like '" + bean.getUserName() + "%'");
			}
			if (bean.getRecommendationType() != null && bean.getRecommendationType().length() > 0) {
				sql.append(" AND recommendationType like '" + bean.getRecommendationType() + "%'");
			}
			if (bean.getStatus() != null && bean.getStatus().length() > 0) {
				sql.append(" AND status like '" + bean.getStatus() + "%'");
			}
			

		}
		System.out.println(sql.toString());
		return sql.toString();
	}

public AIRecommendationBean findByRecommendationCode(String recommendationCode) {
		
		return findByUniqueColumn("recommendationCode", recommendationCode);
	}

	
	@Override
	public String getTable() {
		
		return "ai_recommendation";
	}

	@Override
	public AIRecommendationBean getBean() {
		// TODO Auto-generated method stub
		return new AIRecommendationBean();
	}

}
