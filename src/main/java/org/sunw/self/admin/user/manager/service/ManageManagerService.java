package org.sunw.self.admin.user.manager.service;

import java.util.List;

import org.sunw.self.admin.user.manager.domain.ManageManagerDTO;
import org.sunw.self.admin.user.manager.domain.ManageManagerVO;

public interface ManageManagerService {

	
	
	public int managerInsert(ManageManagerDTO dto);
	//등록
	
	List<ManageManagerVO>getAllUsers (ManageManagerDTO manageManagerDTO);
	//이름에 대한 검색결과
	
	ManageManagerVO getUserById(String userId);
	//조회
		
	int manageUpdate(ManageManagerDTO dto);
	//추가
	
	int managerDelete(String userId); 
	//삭제
	
}
