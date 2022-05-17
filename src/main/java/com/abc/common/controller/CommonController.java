package com.abc.common.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/common")
@CrossOrigin(origins = "*")
public class CommonController {
	
	@GetMapping("/all")
	public String testCommon() {
		return "Common API";
	}	

}
