package org.sunw.self.admin.calendar.date.domain;

import java.util.Date;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class WdDateDTO extends DefaultDTO{
	
	WdDateVO wdDateVO;
	
	String pgRoomId;
	Integer workDate;

}
