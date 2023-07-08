package org.sunw.self.admin.room.controller;

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
import org.sunw.self.admin.room.domain.RoomDTO;
import org.sunw.self.admin.room.service.RoomService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	RoomService roomService;
	
	@GetMapping("/form")
	public void form(RoomDTO dto,Model model) {
		RoomDTO getOne = roomService.selectOneRoom(dto.getPgRoomId());
		model.addAttribute("roomVO",getOne.getRoomVO());
		log.info(model);
	}
	
	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO save(@RequestBody RoomDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = roomService.update(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody RoomDTO dto) {
		ResultDTO result =new ResultDTO();
		boolean isSuccess =roomService.delete(dto.getRoomVO().getPgRoomId())>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	
	}
	
	@GetMapping("/detail")
	public void selectRoom(RoomDTO dto, Model model) {
		RoomDTO getOne =roomService.selectOneRoom(dto.getPgRoomId());
		model.addAttribute("roomVO",getOne.getRoomVO());
		log.info(model);
	}
	
	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO register(@RequestBody RoomDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = roomService.roomInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/register")
	public void register(RoomDTO dto ,Model model) {
		RoomDTO getOne = roomService.selectOneRoom(dto.getPgRoomId());
		model.addAttribute("roomVO",getOne.getRoomVO());
		log.info(model);

		}
	}
