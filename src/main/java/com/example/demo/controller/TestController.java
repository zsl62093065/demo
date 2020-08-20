package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domian.ServiceSetting;

@RestController
public class TestController {

	@Autowired
	private ServiceSetting  serviceSetting;
	
	@GetMapping("/v1/test_properties")
	public Object testProperties() {
		
		return serviceSetting;
	}
	
	@RequestMapping("/test/home")
	public String home() {
		return "hello world";
	}
	
	
}
