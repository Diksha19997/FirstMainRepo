package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FirstService;

@RestController
@RequestMapping("/FirstProject")
public class FirstProjectController {
	
	@Autowired
	private FirstService service;
	
	@GetMapping("/hello")
	public String helloPages() {
		return service.s1();
	}

}
