package org.sunw.self.admin.user.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.sunw.self.admin.common.domain.PageDTO;
import org.sunw.self.admin.infomation.store.domain.StoreInfoVO;
import org.sunw.self.admin.user.manager.domain.ManageManagerDTO;
import org.sunw.self.admin.user.manager.domain.ManageManagerVO;
import org.sunw.self.admin.user.user.domain.ManageUserDTO;

public interface ManageManagerMapper {
	
	public int managerInsert(ManageManagerVO manageManagerVO);
	
	public List<ManageManagerVO> getAllManagerList(ManageManagerDTO manageManagerDTO);
	

	ManageManagerVO getUserById(@Param("userId") String userId);
	
	
	public int managerUpdate(ManageManagerVO manageManagerVO);
	
	public int managerDelete(String userId);
	
	public int getManagerListCnt(ManageUserDTO manageUserDTO);
	
	
}
