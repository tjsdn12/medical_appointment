package org.sunw.self.admin.appoint.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AppointVO {
	
	Integer apId;
	String userId;
	Integer pgId; 
	Integer pgOptionId;
	Integer pgRoomId;
	Integer apDurationTime;
	Integer apPrice;
	String apStartDt;
	String apEndDt;
	String apStatus;
	String apDt;


}
