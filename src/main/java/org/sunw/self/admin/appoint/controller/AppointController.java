package org.sunw.self.admin.appoint.controller;


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
import org.sunw.self.admin.appoint.service.AppointService;
import org.sunw.self.admin.common.domain.PageMaker;
import org.sunw.self.admin.common.domain.ResultDTO;


import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/appoint")
public class AppointController {
	
	@Autowired
	AppointService appointService;
	
	
	@GetMapping("/list")
	public void goList(AppointDTO dto,Model model) {
		
		model.addAttribute("getAllInquiryList",appointService.getAllApppoint(dto));
		PageMaker pageMaker = new PageMaker(dto, appointService.appintCnt(dto));
		model.addAttribute("pageMaker", pageMaker);
		
	}
	
	@GetMapping("/form")
	public void form(AppointDTO dto ,Model model) {
		AppointDTO getOne = appointService.getAppointId(dto.getApId());
		model.addAttribute("appointVO",getOne.getAppointVO());
		log.info(model);
		
		model.addAttribute("getUserList" ,appointService.getUserList());
		
		model.addAttribute("getProgramList" ,appointService.getProgramList());
		
		model.addAttribute("getRoomList" , appointService.getRoomList());
		
	}
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO save(@RequestBody AppointDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = appointService.appointUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody AppointDTO dto) {
		ResultDTO result =new ResultDTO();
		boolean isSuccess =appointService.appointDelete(dto.getAppointVO().getApId())>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	
	}
	
	@GetMapping("/detail")
	public void selectCategory(AppointDTO dto, Model model) {
		AppointDTO getOne =appointService.getAppointId(dto.getApId());
		model.addAttribute("appointVO",getOne.getApId());
		log.info(model);
	}

	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO register(@RequestBody AppointDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = appointService.appointInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/register")
	public void register(AppointDTO dto ,Model model) {
		AppointDTO getOne = appointService.getAppointId(dto.getApId());
		model.addAttribute("appointVO",getOne.getAppointVO());
		log.info(model);
	}
}
