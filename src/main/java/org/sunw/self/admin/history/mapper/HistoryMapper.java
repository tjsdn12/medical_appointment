package org.sunw.self.admin.history.mapper;

import java.util.List;

import org.sunw.self.admin.history.domain.HistoryDTO;
import org.sunw.self.admin.history.domain.HistoryVO;
import org.sunw.self.admin.pg.option.domain.OptionVO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;
import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.user.domain.ManageUserVO;

public interface HistoryMapper {
	
	public int historyInsert(HistoryVO historyVO);
	
	public List<HistoryVO>getAllHistory(HistoryDTO dto);
	
	public int historyCnt(HistoryDTO dto);
	
	HistoryVO getHistoryId(int apId);
	
	public int historyUpdate(HistoryVO historyVO);
	
	public int historoyDelete(int apId);
	
	
	public List<ManageUserVO>getUserList();
	
	public List<ProgramVO>getProgramList();
	
	public List<OptionVO>getOptionList();
	
	public List<RoomVO>getRoomList();
	
}
