package org.sunw.self.admin.user.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;


@Data
public class ManageUserDTO extends DefaultDTO {
	ManageUserVO manageUserVO;
	
	String userId;
}

