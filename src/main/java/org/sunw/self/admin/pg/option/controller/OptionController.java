package org.sunw.self.admin.pg.option.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.sunw.self.admin.common.domain.ResultDTO;
import org.sunw.self.admin.pg.option.domain.OptionDTO;
import org.sunw.self.admin.pg.option.service.OptionService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/option")
public class OptionController {
	
	@Autowired
	OptionService optionService;
	

	@GetMapping("/form")
	public void OptionIdSerch (OptionDTO dto,Model model) {
		OptionDTO getOne =optionService.getOptionById(dto.getPgOptionId());
		model.addAttribute("OptionVO",getOne.getOptionVO());
		log.info(model);
	}
	//옵션 검색
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO editOptionInfo(@RequestBody OptionDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = optionService.optionUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	//옵션 정보수정
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody OptionDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = optionService.optionUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/detail")
	public void selectOption(OptionDTO dto,Model model) {
		OptionDTO getOne = optionService.getOptionById(dto.getPgOptionId());
		model.addAttribute("OptionVO",getOne.getOptionVO());
		log.info(model);
	}
	//옵션 상세보기
	
	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO optionInfoRegister(@RequestBody OptionDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = optionService.OptionInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	//옵션 정보등록
	
	@GetMapping("/register")
	public void register(OptionDTO dto ,Model model) {
		OptionDTO getOne = optionService.getOptionById(dto.getPgOptionId());
		model.addAttribute("OptionVO",getOne.getOptionVO());
		log.info(model);
	}
	//옵션 페이지 표시
	

}
