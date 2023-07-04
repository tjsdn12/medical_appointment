package org.sunw.self.admin.appoint.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class AppointDTO extends DefaultDTO{
	
	StoreInfoVO storeInfoVO;
	
	String sId;
	
	String sName;
 
}
