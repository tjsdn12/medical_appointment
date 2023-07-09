package org.sunw.self.admin.calendar.date.controller;

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
import org.sunw.self.admin.appoint.domain.AppointDTO;
import org.sunw.self.admin.calendar.date.domain.WdDateDTO;
import org.sunw.self.admin.calendar.date.service.WdDateService;
import org.sunw.self.admin.common.domain.PageMaker;
import org.sunw.self.admin.common.domain.ResultDTO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/calendar/date")
public class WdDateController {

	
	@Autowired
	WdDateService wdDateService;
	
	@GetMapping("/list")
	public void goCalendarDate(WdDateDTO dto,Model model) {
		
		model.addAttribute("getAllDate",wdDateService.getAllDate(dto));
		PageMaker pageMaker = new PageMaker(dto, wdDateService.DateCnt(dto));
		model.addAttribute("pageMaker", pageMaker);
		
	}
	
	@GetMapping("/form")
	public void form(WdDateDTO dto ,Model model) {
		WdDateDTO getOne = wdDateService.getOneDate(dto.getWorkDate());
		model.addAttribute("wdDateVO",getOne.getWdDateVO());
		log.info(model);
				
		model.addAttribute("getRoomList" , wdDateService.getRoomList());
		
		model.addAttribute("getWorkList" ,wdDateService.getWorkList());

		
	}
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO save(@RequestBody WdDateDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = wdDateService.DateUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody WdDateDTO dto) {
		ResultDTO result =new ResultDTO();
		boolean isSuccess =wdDateService.DateDelete(dto.getWdDateVO().getWorkDate())>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	
	}
	
	@GetMapping("/detail")
	public void selectCalendar(WdDateDTO dto, Model model) {
		WdDateDTO getOne =wdDateService.getOneDate(dto.getWorkDate());
		model.addAttribute("wdDateVO",getOne.getWorkDate());
		log.info(model);
	}

	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO register(@RequestBody WdDateDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = wdDateService.dateInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/register")
	public void register(WdDateDTO dto ,Model model) {
		WdDateDTO getOne = wdDateService.getOneDate(dto.getWorkDate());
		model.addAttribute("wdDateVO",getOne.getWdDateVO());
		log.info(model);
	}
	
}
