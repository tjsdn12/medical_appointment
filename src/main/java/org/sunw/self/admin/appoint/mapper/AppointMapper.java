package org.sunw.self.admin.appoint.mapper;

import java.util.List;

import org.sunw.self.admin.appoint.domain.AppointDTO;
import org.sunw.self.admin.appoint.domain.AppointVO;
import org.sunw.self.admin.pg.option.domain.OptionVO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;
import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.user.user.domain.ManageUserVO;

public interface AppointMapper {
	
	public int appointInsert(AppointVO appointVO);
	
	public List<AppointVO> getAllApppoint(AppointDTO dto);
	
	public int appintCnt(AppointDTO dto);
	
	AppointVO getAppointId(int apId);
	
	public int appointUpdate(AppointVO appointVO);
	
	public int appointDelete(int apId);

	
	
	public List<ManageUserVO>getUserList();
	
	public List<ProgramVO>getProgramList();
	
	public List<OptionVO>getOptionList();
	
	public List<RoomVO>getRoomList();
	
}
