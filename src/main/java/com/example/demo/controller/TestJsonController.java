package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Executives;

@RestController
public class TestJsonController {

	
	
	@GetMapping("/testJson")
	public Object testJson() {
		return new Executives("李明", "男", "程序员", "湖北省武汉市青山区", 9000, new Date());
		
	}
	
	
}
