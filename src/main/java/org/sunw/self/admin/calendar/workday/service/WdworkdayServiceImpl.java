package org.sunw.self.admin.calendar.workday.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.sunw.self.admin.calendar.workday.domain.WdWorkdayDTO;
import org.sunw.self.admin.calendar.workday.domain.WdWorkdayVO;
import org.sunw.self.admin.calendar.workday.mapper.WdWorkdayMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WdworkdayServiceImpl implements WdworkdayService {
	
	
	private final WdWorkdayMapper wdWorkdayMapper;
	
	@Override
	public int workDayInsert(WdWorkdayDTO dto) {

		return wdWorkdayMapper.workDayInsert(dto.getWdWorkdayVO());
	}

	@Override
	public List<WdWorkdayVO> getWorkList(WdWorkdayDTO dto) {

		List<WdWorkdayVO>list = wdWorkdayMapper.getWorkList(dto);
		return list;
	}

	@Override
	public int workDayCnt(WdWorkdayDTO dto) {
		
		return wdWorkdayMapper.workDayCnt(dto);
	}

	@Override
	public WdWorkdayDTO getOneWorkDay(int wdId) {

		WdWorkdayDTO dto = new WdWorkdayDTO();
		dto.setWdWorkdayVO(wdWorkdayMapper.getOneWorkDay(wdId));
		return dto;
	}

	@Override
	public int workDayUpdate(WdWorkdayDTO dto) {

		return wdWorkdayMapper.workDayUpdate(dto.getWdWorkdayVO());
	}

	@Override
	public int workDayDelete(int wdId) {

		return wdWorkdayMapper.workDayDelete(wdId);
	}

}
