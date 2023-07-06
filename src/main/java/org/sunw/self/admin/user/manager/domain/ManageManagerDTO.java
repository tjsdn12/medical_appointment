package org.sunw.self.admin.user.manager.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class ManageManagerDTO extends DefaultDTO {
	
	private ManageManagerVO manageManagerVO;

	
public String userId() {
	return manageManagerVO.getUserId();
}

	
}
