package com.sunilos.p4.bean;

import java.sql.ResultSet;
import java.util.Date;

public class EventBean extends BaseBean{
private String eventName;
private Date eventDate;
private String venue;
private String organizer;


	public String getEventName() {
	return eventName;
}

public void setEventName(String eventName) {
	this.eventName = eventName;
}

public Date getEventDate() {
	return eventDate;
}

public void setEventDate(Date eventDate) {
	this.eventDate = eventDate;
}

public String getVenue() {
	return venue;
}

public void setVenue(String venue) {
	this.venue = venue;
}

public String getOrganizer() {
	return organizer;
}

public void setOrganizer(String organizer) {
	this.organizer = organizer;
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
			this.setEventName(rs.getString(2));
			this.setEventDate(rs.getDate(3));
			this.setVenue(rs.getString(4));
			this.setOrganizer(rs.getString(5));
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}

}
