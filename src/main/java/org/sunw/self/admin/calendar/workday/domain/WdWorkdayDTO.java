package org.sunw.self.admin.calendar.workday.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class WdWorkdayDTO extends DefaultDTO {

	WdWorkdayVO wdWorkdayVO;
	
	Integer wdId;
}
