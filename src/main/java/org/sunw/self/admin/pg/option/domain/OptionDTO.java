package org.sunw.self.admin.pg.option.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class OptionDTO extends DefaultDTO{
	
	OptionVO optionVO;
	
	Integer pgOptionId;

}
