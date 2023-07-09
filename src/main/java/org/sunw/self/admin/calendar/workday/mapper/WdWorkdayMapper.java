package org.sunw.self.admin.calendar.workday.mapper;

import java.util.List;

import org.sunw.self.admin.calendar.workday.domain.WdWorkdayDTO;
import org.sunw.self.admin.calendar.workday.domain.WdWorkdayVO;

public interface WdWorkdayMapper {
	
	public int workDayInsert(WdWorkdayVO wdWorkdayVO);
	
	public List<WdWorkdayVO> getWorkList(WdWorkdayDTO dto);
	
	public int workDayCnt(WdWorkdayDTO dto);
	
	WdWorkdayVO getOneWorkDay(int wdId);
	
	public int workDayUpdate(WdWorkdayVO wdWorkdayVO);
	
	public int workDayDelete(int wdId);

}
