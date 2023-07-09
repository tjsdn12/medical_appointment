package org.sunw.self.admin.history.service;

import java.util.List;

import org.sunw.self.admin.history.domain.HistoryDTO;
import org.sunw.self.admin.history.domain.HistoryVO;
import org.sunw.self.admin.pg.option.domain.OptionVO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;
import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.user.domain.ManageUserVO;

public interface HistoryService {
	
	public int historyInsert(HistoryDTO dto);
	
	public List<HistoryVO>getAllHistory(HistoryDTO dto);
	
	public int historyCnt(HistoryDTO dto);
	
	HistoryDTO getHistoryId(int apId);
	
	public int historyUpdate(HistoryDTO dto);
	
	public int historoyDelete(int apId);
	
	
	public List<ManageUserVO>getUserList();
	
	public List<ProgramVO>getProgramList();
	
	public List<OptionVO>getOptionList();
	
	public List<RoomVO>getRoomList();

}
