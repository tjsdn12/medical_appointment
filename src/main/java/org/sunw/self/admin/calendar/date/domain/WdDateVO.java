package org.sunw.self.admin.calendar.date.domain;

import java.util.Date;

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
public class WdDateVO {
	
	String pgRoomId;
	Integer workDate;
	String wdId;
	String holidayYn;
	String dateStartDt;
	String dateEndDt;
	String dateRestStartDt;
	String dateRestEndDt;

}
