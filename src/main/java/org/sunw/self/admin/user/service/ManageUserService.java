
package org.sunw.self.admin.user.service;

import java.util.List;

import org.sunw.self.admin.user.domain.ManageUserDTO;
import org.sunw.self.admin.user.domain.ManageUserVO;

public interface ManageUserService {
	
	public int insert(ManageUserDTO manageUserDTO);

	public List<ManageUserVO> getAllUserList( ManageUserDTO manageUserDTO);
	
	public int getUserListCnt(ManageUserDTO manageUserDTO);
	
	
	public int getUserCnt();
	
	public int update(ManageUserDTO manageUserDTO);
	
	public int delete(String userId);
	
	ManageUserDTO getOneUser(String userId);
	
	
}

