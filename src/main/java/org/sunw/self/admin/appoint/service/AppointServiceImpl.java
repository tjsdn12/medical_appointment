package org.sunw.self.admin.appoint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunw.self.admin.appoint.domain.AppointDTO;
import org.sunw.self.admin.appoint.domain.AppointVO;
import org.sunw.self.admin.appoint.mapper.AppointMapper;
import org.sunw.self.admin.pg.program.domain.ProgramVO;
import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.user.user.domain.ManageUserVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointServiceImpl implements AppointService {

	private final AppointMapper appointMapper;
	
	
	
	@Override
	public int appointInsert(AppointDTO dto) {
		
		return appointMapper.appointInsert(dto.getAppointVO());
	}

	@Override
	public List<AppointVO> getAllApppoint(AppointDTO dto) {
		
		List<AppointVO> appointList =appointMapper.getAllApppoint(dto);
		
		return appointList;
	}

	@Override
	public int appintCnt(AppointDTO dto) {

		return appointMapper.appintCnt(dto);
	}

	@Override
	public AppointDTO getAppointId(int apId) {

		AppointDTO dto = new AppointDTO();
		dto.setAppointVO(appointMapper.getAppointId(apId));
		return dto;
	}

	@Override
	public int appointUpdate(AppointDTO dto) {

		return appointMapper.appointUpdate(dto.getAppointVO());
	}

	@Override
	public int appointDelete(int apId) {

		return appointMapper.appointDelete(apId);
	}

	@Override
	public List<ManageUserVO> getUserList() {
		List<ManageUserVO>list = appointMapper.getUserList(); 
		return list;
	}

	@Override
	public List<ProgramVO> getProgramList() {
		List<ProgramVO>list = appointMapper.getProgramList();
		return list;
	}

	@Override
	public List<RoomVO> getRoomList() {
		List<RoomVO>list = appointMapper.getRoomList();
		return list;
	}

}
