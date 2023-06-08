package org.sunw.self.admin.user.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunw.self.admin.user.manager.domain.ManageManagerDTO;
import org.sunw.self.admin.user.manager.domain.ManageManagerVO;
import org.sunw.self.admin.user.manager.mapper.ManageManagerMapper;


@Service
public class ManageManagerServiceImpl implements ManageManagerService {
	
	private final ManageManagerMapper manageManagerMapper;
	
	@Autowired
	public ManageManagerServiceImpl(ManageManagerMapper manageManagerMapper) {
		this.manageManagerMapper=manageManagerMapper;
	}
	@Override
	public ManageManagerVO getUserById(String userId) {
		return manageManagerMapper.getUserById(userId);
	}
	@Override
	public int managerInsert(ManageManagerDTO dto) {
		
		return manageManagerMapper.managerInsert(dto.getManageManagerVO());
	}
	@Override
	public List<ManageManagerVO> getAllUsers(ManageManagerDTO dto) {

		List<ManageManagerVO> userList = manageManagerMapper.getAllUsers(dto);
		
		return userList;
	}
	@Override
	public int manageUpdate(ManageManagerDTO dto) {

		return manageManagerMapper.managerUpdate(dto.getManageManagerVO());
	}
	 @Override
	    public int managerDelete(String userId) { 
	        return manageManagerMapper.managerDelete(userId);
	    }
	

}
