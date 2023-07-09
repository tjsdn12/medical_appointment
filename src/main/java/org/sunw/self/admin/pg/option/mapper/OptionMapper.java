package org.sunw.self.admin.pg.option.mapper;

import java.util.List;

import org.sunw.self.admin.pg.option.domain.OptionDTO;
import org.sunw.self.admin.pg.option.domain.OptionVO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;

public interface OptionMapper {

	public int OptionInsert(OptionVO optionVO);
	
	public List<OptionVO>getAllOptionList(OptionDTO dto);
	
	OptionVO getOptionById(int getpgOptionId);
	
	public int optionUpdate(OptionVO optionVO);
	
	public int optionDelete(int pgOptionId);
	
	public int optionListCnt(OptionDTO dto);
	

	
}
