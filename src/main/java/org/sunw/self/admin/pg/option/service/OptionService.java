package org.sunw.self.admin.pg.option.service;

import java.util.List;

import org.sunw.self.admin.pg.option.domain.OptionDTO;
import org.sunw.self.admin.pg.option.domain.OptionVO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;

public interface OptionService {
	
	public int OptionInsert(OptionDTO dto);
	
	public List<OptionVO>getAllOptionList(OptionDTO dto);
	
	OptionDTO getOptionById(int pgOptionId);
	
	public int optionUpdate(OptionDTO dto);
	
	public int optionDelete(int pgOptionId);
	
	public int optionListCnt(OptionDTO dto);
	
	

	

}
