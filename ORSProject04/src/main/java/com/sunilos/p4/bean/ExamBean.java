package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ExamBean extends BaseBean {

	private String examName;
	private Date examDate;
	private int totalMarks;
	private int passingMarks;

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getPassingMarks() {
		return passingMarks;
	}

	public void setPassingMarks(int passingMarks) {
		this.passingMarks = passingMarks;
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
			this.setExamName(rs.getString(2));
			this.setExamDate(rs.getDate(3));
			this.setTotalMarks(rs.getInt(4));
			this.setPassingMarks(rs.getInt(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
