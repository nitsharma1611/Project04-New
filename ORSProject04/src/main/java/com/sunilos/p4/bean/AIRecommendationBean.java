package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AIRecommendationBean extends BaseBean {
private String recommendationCode;
private String userName;
private String recommendationType;
private String status;

	
	
	
	
	
	
	
	public String getRecommendationCode() {
	return recommendationCode;
}

public void setRecommendationCode(String recommendationCode) {
	this.recommendationCode = recommendationCode;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getRecommendationType() {
	return recommendationType;
}

public void setRecommendationType(String recommendationType) {
	this.recommendationType = recommendationType;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResultset(ResultSet rs) {
		try {
			super.setResultset(rs);	
			this.setRecommendationCode(rs.getString(2));
			this.setUserName(rs.getString(3));
			this.setRecommendationType(rs.getString(4));
			this.setStatus(rs.getString(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
