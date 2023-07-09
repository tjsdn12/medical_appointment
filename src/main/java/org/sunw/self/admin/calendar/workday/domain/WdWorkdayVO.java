package org.sunw.self.admin.calendar.workday.domain;

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
public class WdWorkdayVO {
	
	
	Integer wdId;
	String wdName;
	String holidayYn; 
	String wdStartTime; 
	String wdEndTime; 
	String wdRestStartTime; 
	String wdRestEndTime;

}
