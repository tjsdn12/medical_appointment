package org.sunw.self.admin.workday.date.service;

import java.util.List;

import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.workday.date.domain.WdDateDTO;
import org.sunw.self.admin.workday.date.domain.WdDateVO;
import org.sunw.self.admin.workday.workday.domain.WdWorkdayVO;

public interface WdDateService {
	
	public int dateInsert(WdDateDTO dto);
	
	public List<WdDateVO> getAllDate(WdDateDTO dto);
	
	public int DateCnt(WdDateDTO dto);
	
	WdDateDTO getOneDate(int workDate);
	
	public int DateUpdate(WdDateDTO dto);
	
	public int DateDelete(int workDate);


	public List<RoomVO>getRoomList();
	
	public List<WdWorkdayVO>getWorkList();
	

}
