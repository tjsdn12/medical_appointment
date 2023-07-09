package org.sunw.self.admin.history.domain;

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
public class HistoryVO {

	
		Integer apId;
		String userId; 
		Integer pgId; 
		Integer pgOptionId; 
		Integer pgRoomId; 
		Integer apHistoryPrice; 
		Date apHistoryStartDt; 
		Date apHistoryEndDt; 
		String apHistoryStatus; 
		Date apHistoryDt;
		
	
	
}
