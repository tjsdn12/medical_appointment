package org.sunw.self.admin.category.controller;

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
import org.sunw.self.admin.category.service.CategoryService;
import org.sunw.self.admin.common.domain.ResultDTO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/category")
public class CategoryControlelr {
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("/form")
	public void form(CategoryDTO dto ,Model model) {
		CategoryDTO getOne = categoryService.getCategoryId(dto.getCategoryId());
		model.addAttribute("categoryVO",getOne.getCategoryVO());
		log.info(model);
	}

	@PutMapping("/form")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO save(@RequestBody CategoryDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = categoryService.categoryUpdate(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@DeleteMapping("/list")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO delete(@RequestBody CategoryDTO dto) {
		ResultDTO result =new ResultDTO();
		boolean isSuccess =categoryService.categoryDelete(dto.getCategoryVO().getCategoryId())>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"삭제되었습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	
	}
	
	@GetMapping("/detail")
	public void selectCategory(CategoryDTO dto, Model model) {
		CategoryDTO getOne =categoryService.getCategoryId(dto.getCategoryId());
		model.addAttribute("categoryVO",getOne.getCategoryVO());
		log.info(model);
	}
	
	@PutMapping("/register")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResultDTO register(@RequestBody CategoryDTO dto) {
		ResultDTO result = new ResultDTO();
		boolean isSuccess = categoryService.categoryInsert(dto)>0;
		result.setSuccess(isSuccess);
		String message = isSuccess?"저장에 성공하였습니다.":"오류가 발생하였습니다.";
		result.setMessage(message);
		return result;
	}
	
	@GetMapping("/register")
	public void register(CategoryDTO dto ,Model model) {
		CategoryDTO getOne = categoryService.getCategoryId(dto.getCategoryId());
		model.addAttribute("categoryVO",getOne.getCategoryVO());
		log.info(model);
	}
	
}
