package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages = {"com.example.com.example.demo.controller.DemoController"})
public class DemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	

	/*
	 * @GetMapping("/hello") public String hello(@RequestParam(value = "name",
	 * defaultValue = "World") String name) { return String.format("Hello %s!",
	 * name); }
	 */
	
	/*
	 * @RequestMapping("/testMap") public Map<String,String> testMap(){
	 * Map<String,String> map=new HashMap<>(); map.put("name", "李明"); return map;
	 * 
	 * }
	 */
}
