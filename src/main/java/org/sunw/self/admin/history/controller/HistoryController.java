package org.sunw.self.admin.history.controller;

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
import org.sunw.self.admin.common.domain.PageMaker;
import org.sunw.self.admin.common.domain.ResultDTO;
import org.sunw.self.admin.history.domain.HistoryDTO;
import org.sunw.self.admin.history.service.HistoryService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/history")
public class HistoryController {

	
	@Autowired
	HistoryService historyService;
	
	@GetMapping("/list")
	public void goList(HistoryDTO dto,Model model) {
		
		model.addAttribute("getAllHistory",historyService.getAllHistory(dto));
		PageMaker pageMaker = new PageMaker(dto, historyService.historyCnt(dto));
		model.addAttribute("pageMaker", pageMaker);
		
	}
	
	@GetMapping("/form")
	public void form(HistoryDTO dto ,Model model) {
		HistoryDTO getOne = historyService.getHistoryId(dto.getApId());
		model.addAttribute("historyVO",getOne.getHistoryVO());
		log.info(model);
		
		model.addAttribute("getUserList" ,historyService.getUserList());
		
		model.addAttribute("getProgramList" ,historyService.getProgramList());
		
		model.addAttribute("getRoomList" , historyService.getRoomList());
		
	}
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO save(@RequestBody HistoryDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = historyService.historyUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody HistoryDTO dto) {
		ResultDTO result =new ResultDTO();
		boolean isSuccess =historyService.historoyDelete(dto.getHistoryVO().getApId())>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	
	}
	
	@GetMapping("/detail")
	public void selectHistory(HistoryDTO dto, Model model) {
		HistoryDTO getOne =historyService.getHistoryId(dto.getApId());
		model.addAttribute("historyVO",getOne.getApId());
		log.info(model);
	}

	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO register(@RequestBody HistoryDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = historyService.historyInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/register")
	public void register(HistoryDTO dto ,Model model) {
		HistoryDTO getOne = historyService.getHistoryId(dto.getApId());
		model.addAttribute("historyVO",getOne.getHistoryVO());
		log.info(model);
	}
	
	
}
