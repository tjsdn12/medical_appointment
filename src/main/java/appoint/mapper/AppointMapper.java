package appoint.mapper;

import java.util.List;

import appoint.domain.AppointDTO;
import appoint.domain.AppointVO;

public interface AppointMapper {
	
	public int appointInsert(AppointVO appointVO);
	
	public List<AppointVO> getAllApppoint(AppointDTO dto);
	
	public int appintCnt(AppointDTO dto);
	
	public int appointUpdate(AppointVO appointVO);
	
	public int appointDelete(String apId);

}
