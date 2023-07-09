package org.sunw.self.admin.history.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.sunw.self.admin.history.domain.HistoryDTO;
import org.sunw.self.admin.history.domain.HistoryVO;
import org.sunw.self.admin.history.mapper.HistoryMapper;
import org.sunw.self.admin.pg.option.domain.OptionVO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;
import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.user.domain.ManageUserVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {
	
	
	private final HistoryMapper historyMapper; 
	
	
	@Override
	public int historyInsert(HistoryDTO dto) {
		
		return historyMapper.historyInsert(dto.getHistoryVO());
	}

	@Override
	public List<HistoryVO> getAllHistory(HistoryDTO dto) {

		List<HistoryVO>list = historyMapper.getAllHistory(dto);
		return list;
	}

	@Override
	public int historyCnt(HistoryDTO dto) {

		return historyMapper.historyCnt(dto);
	}

	@Override
	public HistoryDTO getHistoryId(int apId) {

		HistoryDTO dto = new HistoryDTO();
		dto.setHistoryVO(historyMapper.getHistoryId(apId));
		return null;
	}

	@Override
	public int historyUpdate(HistoryDTO dto) {
		
		return historyMapper.historyUpdate(dto.getHistoryVO());
	}

	@Override
	public int historoyDelete(int apId) {

		return historyMapper.historoyDelete(apId);
	}

	@Override
	public List<ManageUserVO> getUserList() {

		List<ManageUserVO>list = historyMapper.getUserList();
		return list;
	}

	@Override
	public List<ProgramVO> getProgramList() {

		List<ProgramVO>list = historyMapper.getProgramList();
		return list;
	}

	@Override
	public List<OptionVO> getOptionList() {

		List<OptionVO>list = historyMapper.getOptionList();
		return list;
	}

	@Override
	public List<RoomVO> getRoomList() {

		List<RoomVO>list = historyMapper.getRoomList();
		return list;
	}

}
