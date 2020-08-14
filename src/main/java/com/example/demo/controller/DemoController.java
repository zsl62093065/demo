package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class DemoController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello world";
	}
	
	@RequestMapping("/testMap")
	public Map<String,String> testMap(){
		Map<String,String> map=new HashMap<>();
		map.put("name", "李明");
		return map;
		
	}
}
