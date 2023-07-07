package org.sunw.self.admin.pg.program.mapper;

import java.util.List;

import org.sunw.self.admin.category.domain.CategoryVO;
import org.sunw.self.admin.pg.program.domain.ProgramDTO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;

public interface ProgramMapper {
	
	public int programInsert(ProgramVO programVO);
	
	public List<ProgramVO>getProgramList(ProgramDTO dto);
	
	ProgramVO getProgramById(int pgId);
	
	public int programUpdate(ProgramVO programVO);
	
	public int programDelete(Integer pgId);
	
	public int programListCnt(ProgramDTO dto);
	
	
	public List<CategoryVO>getCategoryList();

}
