package org.sunw.self.admin.pg.program.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.sunw.self.admin.category.domain.CategoryVO;
import org.sunw.self.admin.pg.program.domain.ProgramDTO;
import org.sunw.self.admin.pg.program.domain.ProgramVO;
import org.sunw.self.admin.pg.program.mapper.ProgramMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProgramServiceImpl implements ProgramService{
	
	private ProgramMapper programMapper;
	
	@Override
	public int programInsert(ProgramDTO dto) {
		
		return programMapper.programInsert(dto.getProgramVO());
	}

	@Override
	public List<ProgramVO> getProgramList(ProgramDTO dto) {

		List<ProgramVO>list = programMapper.getProgramList(dto);
		return list;
	}

	@Override
	public ProgramDTO getProgramById(int pgId) {

		ProgramDTO dto = new ProgramDTO();
		dto.setProgramVO(programMapper.getProgramById(pgId));
		return dto;
		
		
	}

	@Override
	public int programUpdate(ProgramDTO dto) {

		return programMapper.programUpdate(dto.getProgramVO());
	}

	@Override
	public int programDelete(int pgId) {

		return programMapper.programDelete(pgId);
	}

	@Override
	public int programListCnt(ProgramDTO dto) {

		return programMapper.programListCnt(dto);
	}

	@Override
	public List<CategoryVO> getCategoryList() {
		List<CategoryVO>list = programMapper.getCategoryList();
		return list;
	}

}
