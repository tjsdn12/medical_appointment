package org.sunw.self.admin.calendar.date.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.sunw.self.admin.calendar.date.domain.WdDateDTO;
import org.sunw.self.admin.calendar.date.domain.WdDateVO;
import org.sunw.self.admin.calendar.date.mapper.WdDateMapper;
import org.sunw.self.admin.calendar.workday.domain.WdWorkdayVO;
import org.sunw.self.admin.room.domain.RoomVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WdDateServiceImpl implements WdDateService{
	
	private final WdDateMapper wdDateMapper;
	
	
	@Override
	public int dateInsert(WdDateDTO dto) {

		return wdDateMapper.dateInsert(dto.getWdDateVO());
	}

	@Override
	public List<WdDateVO> getAllDate(WdDateDTO dto) {

		List<WdDateVO> dateList =wdDateMapper.getAllDate(dto);
		
		return dateList;
	}

	@Override
	public int DateCnt(WdDateDTO dto) {

		return wdDateMapper.DateCnt(dto);
	}

	@Override
	public WdDateDTO getOneDate(int workDate) {

		WdDateDTO dto = new WdDateDTO();
		dto.setWdDateVO(wdDateMapper.getOneDate(workDate));
		return dto;
	}

	@Override
	public int DateUpdate(WdDateDTO dto) {

		return wdDateMapper.DateUpdate(dto.getWdDateVO());
	}

	@Override
	public int DateDelete(int workDate) {

		return wdDateMapper.DateDelete(workDate);
	}

	@Override
	public List<RoomVO> getRoomList() {

		List<RoomVO>list = wdDateMapper.getRoomList();
		return list;
	}

	@Override
	public List<WdWorkdayVO> getWorkList() {

		List<WdWorkdayVO> list = wdDateMapper.getWorkList();
		return list;
	}

}
