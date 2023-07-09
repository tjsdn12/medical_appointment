package org.sunw.self.admin.calendar.workday.service;

import java.util.List;

import org.sunw.self.admin.calendar.workday.domain.WdWorkdayDTO;
import org.sunw.self.admin.calendar.workday.domain.WdWorkdayVO;

public interface WdworkdayService {
	
	public int workDayInsert(WdWorkdayDTO dto);
	
	public List<WdWorkdayVO> getWorkList(WdWorkdayDTO dto);
	
	public int workDayCnt(WdWorkdayDTO dto);
	
	WdWorkdayDTO getOneWorkDay(int wdId);
	
	public int workDayUpdate(WdWorkdayDTO dto);
	
	public int workDayDelete(int wdId);

}
