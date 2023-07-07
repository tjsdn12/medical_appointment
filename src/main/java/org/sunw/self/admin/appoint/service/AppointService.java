package org.sunw.self.admin.appoint.service;

import java.util.List;

import org.sunw.self.admin.appoint.domain.AppointDTO;
import org.sunw.self.admin.appoint.domain.AppointVO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;
import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.user.user.domain.ManageUserVO;

public interface AppointService {
	
	public int appointInsert(AppointDTO dto);
	
	public List<AppointVO> getAllApppoint(AppointDTO dto);
	
	public int appintCnt(AppointDTO dto);
	
	AppointDTO getAppointId(int apId);
	
	public int appointUpdate(AppointDTO dto);
	
	public int appointDelete(int apId);
	
	
	
	public List<ManageUserVO> getUserList();
	
	public List<ProgramVO> getProgramList();
	
	public List<RoomVO> getRoomList();
	
	
}
