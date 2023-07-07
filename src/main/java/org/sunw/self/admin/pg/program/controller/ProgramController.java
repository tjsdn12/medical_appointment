package org.sunw.self.admin.pg.program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sunw.self.admin.pg.program.service.ProgramService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/program")
public class ProgramController {
	
	
	@Autowired
	ProgramService programService;
	
	

}
