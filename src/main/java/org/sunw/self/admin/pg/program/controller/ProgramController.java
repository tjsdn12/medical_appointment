package org.sunw.self.admin.pg.program.controller;

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
import org.sunw.self.admin.category.domain.CategoryDTO;
import org.sunw.self.admin.common.domain.ResultDTO;
import org.sunw.self.admin.pg.program.domain.ProgramDTO;
import org.sunw.self.admin.pg.program.service.ProgramService;


import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/program")
public class ProgramController {
	
	
	@Autowired
	ProgramService programService;
	
	@GetMapping("/form")
	public void form (ProgramDTO dto,Model model) {
		ProgramDTO getOne =programService.getProgramById(dto.getPgId());
		model.addAttribute("programVO",getOne.getProgramVO());
		log.info(model);
	}
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO save(@RequestBody ProgramDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = programService.programUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody ProgramDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = programService.programUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/detail")
	public void selectProgram(ProgramDTO dto,Model model) {
		ProgramDTO getOne = programService.getProgramById(dto.getPgId());
		model.addAttribute("programVO",getOne.getProgramVO());
		log.info(model);
	}
	
	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO register(@RequestBody ProgramDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = programService.programInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/register")
	public void register(ProgramDTO dto ,Model model) {
		ProgramDTO getOne = programService.getProgramById(dto.getPgId());
		model.addAttribute("ProgramVO",getOne.getProgramVO());
		log.info(model);
	}
	
	

}
