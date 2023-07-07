package org.sunw.self.admin.pg.program.service;

import java.util.List;

import org.sunw.self.admin.category.domain.CategoryVO;
import org.sunw.self.admin.pg.program.domain.ProgramDTO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;

public interface ProgramService {
	
	public int programInsert(ProgramDTO dto);
	
	public List<ProgramVO>getProgramList(ProgramDTO dto);
	
	ProgramDTO getProgramById(int pgId);
	
	public int programUpdate(ProgramDTO dto);
	
	public int programDelete(int pgId);
	
	public int programListCnt(ProgramDTO dto);
	
	public List<CategoryVO>getCategoryList();

}
