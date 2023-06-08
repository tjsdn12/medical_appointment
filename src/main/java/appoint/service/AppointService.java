package appoint.service;

import java.util.List;

import appoint.domain.AppointDTO;
import appoint.domain.AppointVO;


public interface AppointService {
	
	public int appointInsert(AppointDTO dto);
	//예약등록
	public List<AppointVO>getAllApppoint(AppointDTO dto);
	//등록된 예약 검색 결과
	public int appintCnt(AppointDTO dto);
	//예약 카운트
	public int appointUpdate(AppointDTO dto);
	
	public int appointDelete(Integer apId);
	
	
}
