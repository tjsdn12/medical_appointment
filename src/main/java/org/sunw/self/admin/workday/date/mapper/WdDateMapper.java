package org.sunw.self.admin.workday.date.mapper;

import java.util.List;

import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.workday.date.domain.WdDateDTO;
import org.sunw.self.admin.workday.date.domain.WdDateVO;
import org.sunw.self.admin.workday.workday.domain.WdWorkdayVO;

public interface WdDateMapper {
	
	public int dateInsert(WdDateVO wdDateVO);
	
	public List<WdDateVO> getAllDate(WdDateDTO dto);
	
	public int DateCnt(WdDateDTO dto);
	
	WdDateVO getOneDate(int workDate);
	
	public int DateUpdate(WdDateVO wdDateVO);
	
	public int DateDelete(int workDate);


	public List<RoomVO>getRoomList();
	
	public List<WdWorkdayVO>getWorkList();
	

}
