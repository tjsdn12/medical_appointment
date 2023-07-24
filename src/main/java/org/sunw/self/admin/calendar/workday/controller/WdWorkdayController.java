package org.sunw.self.admin.calendar.workday.controller;

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
import org.sunw.self.admin.calendar.workday.domain.WdWorkdayDTO;
import org.sunw.self.admin.calendar.workday.service.WdworkdayService;
import org.sunw.self.admin.common.domain.PageMaker;
import org.sunw.self.admin.common.domain.ResultDTO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/calendar/workday")
public class WdWorkdayController {

	
	@Autowired
	WdworkdayService wdworkdayService;
	
	@GetMapping("/list")
	public void goList(WdWorkdayDTO dto,Model model) {
		model.addAttribute("getWorkList",wdworkdayService.getWorkList(dto));
		PageMaker pageMaker = new PageMaker(dto, wdworkdayService.workDayCnt(dto));
		model.addAttribute("pageMaker", pageMaker);
		
	}
	
	@GetMapping("/form")
	public void form(WdWorkdayDTO dto ,Model model) {
		WdWorkdayDTO getOne = wdworkdayService.getOneWorkDay(dto.getWdId());
		model.addAttribute("wdWorkdayVO",getOne.getWdWorkdayVO());
		log.info(model);
		
	}
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO save(@RequestBody WdWorkdayDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = wdworkdayService.workDayUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody WdWorkdayDTO dto) {
		ResultDTO result =new ResultDTO();
		boolean isSuccess =wdworkdayService.workDayDelete(dto.getWdWorkdayVO().getWdId())>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	
	}
	
	@GetMapping("/detail")
	public void selectDay(WdWorkdayDTO dto, Model model) {
		WdWorkdayDTO getOne =wdworkdayService.getOneWorkDay(dto.getWdId());
		model.addAttribute("wdWorkdayVO",getOne.getWdId());
		log.info(model);
	}

	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO register(@RequestBody WdWorkdayDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = wdworkdayService.workDayInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/register")
	public void register(WdWorkdayDTO dto ,Model model) {
		WdWorkdayDTO getOne = wdworkdayService.getOneWorkDay(dto.getWdId());
		model.addAttribute("wdWorkdayVO",getOne.getWdWorkdayVO());
		log.info(model);
	}


}
