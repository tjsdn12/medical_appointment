package org.sunw.self.admin.appoint.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class AppointDTO extends DefaultDTO{
	
	AppointVO appointVO;
	
	Integer apId;
}
