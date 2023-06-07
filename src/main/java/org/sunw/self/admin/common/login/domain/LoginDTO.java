package org.sunw.self.admin.common.login.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class LoginDTO extends DefaultDTO {

	LoginVO loginVO;
	
	String name;
	String password;
	String phonNumber;
	
}
