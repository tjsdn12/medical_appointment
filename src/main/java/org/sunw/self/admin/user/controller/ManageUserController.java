package org.sunw.self.admin.user.controller;



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
import org.sunw.self.admin.user.domain.ManageUserDTO;
import org.sunw.self.admin.user.service.ManageUserService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/user")
public class ManageUserController {
	@Autowired
	ManageUserService manageUserService;
	

	@GetMapping("/form")
	public void getUserID(ManageUserDTO manageUserDTO ,Model model) {
		ManageUserDTO getOne = manageUserService.getOneUser(manageUserDTO.getUserId());
		model.addAttribute("manageUserVO",getOne.getManageUserVO());
		log.info(model);
	}
	/*사용자 정보조회 
	 * 기능적으로 식별자에 해당하는 사용자를 가져와 사용자 정보 출력
	 * */
	
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO editUserInfo(@RequestBody ManageUserDTO manageUserDTO) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = manageUserService.update(manageUserDTO)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	//사용자 정보수정 

	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody ManageUserDTO manageUserDTO) {
		ResultDTO result =new ResultDTO();
		boolean isSuccess =manageUserService.delete(manageUserDTO.getManageUserVO().getUserId())>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	
	}
	
	
	@GetMapping("/detail")
	public void selectUserInfo (ManageUserDTO manageUserDTO, Model model) {
		ManageUserDTO getOne =manageUserService.getOneUser(manageUserDTO.getUserId());
		model.addAttribute("manageUserVO",getOne.getManageUserVO());
		log.info(model);
	}
	//사용자 정보상세보기

	
	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO userRegist (@RequestBody ManageUserDTO manageUserDTO) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = manageUserService.insert(manageUserDTO)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	//사용자 정보등록 

	
	@GetMapping("/register")
	public void goRegister(ManageUserDTO manageUserDTO ,Model model) {
		ManageUserDTO getOne = manageUserService.getOneUser(manageUserDTO.getUserId());
		model.addAttribute("manageUserVO",getOne.getManageUserVO());
		log.info(model);
	}
	//사용자 등록 페이지 표시
	
	
}