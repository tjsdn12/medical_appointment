package org.sunw.self.admin.pg.option.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.sunw.self.admin.pg.option.domain.OptionDTO;
import org.sunw.self.admin.pg.option.domain.OptionVO;
import org.sunw.self.admin.pg.option.mapper.OptionMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OptionServiceImpl implements OptionService{
	
	
	private OptionMapper optionMapper;
	
	
	@Override
	public int OptionInsert(OptionDTO dto) {
		
		return optionMapper.OptionInsert(dto.getOptionVO());
	}

	@Override
	public List<OptionVO> getAllOptionList(OptionDTO dto) {

		List<OptionVO> optionList =optionMapper.getAllOptionList(dto);
		
		return optionList;
	}

	@Override
	public OptionDTO getOptionById(int pgOptionId) {

		OptionDTO dto = new OptionDTO();
		dto.setOptionVO(optionMapper.getOptionById(pgOptionId));
		return dto;
	}

	@Override
	public int optionUpdate(OptionDTO dto) {

		return optionMapper.optionUpdate(dto.getOptionVO());
	}

	@Override
	public int optionDelete(int pgOptionId) {

		return optionMapper.optionDelete(pgOptionId);
	}

	@Override
	public int optionListCnt(OptionDTO dto) {

		return optionMapper.optionListCnt(dto);
	}


	

}
