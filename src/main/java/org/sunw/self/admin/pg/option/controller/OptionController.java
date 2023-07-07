package org.sunw.self.admin.pg.option.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sunw.self.admin.common.domain.PageMaker;
import org.sunw.self.admin.pg.option.domain.OptionDTO;
import org.sunw.self.admin.pg.option.service.OptionService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/option")
public class OptionController {
	
	@Autowired
	OptionService optionService;
	
	@GetMapping
	public void goList(OptionDTO dto, Model model) {
		model.addAttribute("getAllOptionList", optionService.getAllOptionList(dto));
		PageMaker pageMaker = new PageMaker(dto, optionService.optionListCnt(dto));
		model.addAttribute("pageMaker",pageMaker);
	}

}
