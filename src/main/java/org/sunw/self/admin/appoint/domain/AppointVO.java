package org.sunw.self.admin.appoint.domain;

import java.util.Date;

public class AppointVO {
	
	Integer apId;
	String userId;
	Integer pgId; 
	Integer pgOptionId;
	Integer pgRoomId;
	Integer apDurationTime;
	Integer apPrice;
	Date apStartDt;
	Date apEndDt;
	String apStatus;
	Date apDt;

	public void setapId(Integer apId) {
		this.apId=apId;
	}
	public Integer getapId() {
		return this.apId;
	}
	

	public void setuserId(String userId) {
		this.userId=userId;
	}
	public String getuserId() {
		return this.userId;
	}
	
	public void setpgId(Integer pgId) {
		this.pgId=pgId;
	}
	public Integer getpgId() {
		return this.pgId;
	}
	
	public void setpgOptionId(Integer pgOptionId) {
		this.pgOptionId=pgOptionId;
	}
	public Integer getpgOptionId() {
		return this.pgOptionId;
	}
	
	public void setpgRoomId(Integer pgRoomId) {
		this.pgRoomId=pgRoomId;
	}
	public Integer getpgRoomId() {
		return this.pgRoomId;
	}
}
