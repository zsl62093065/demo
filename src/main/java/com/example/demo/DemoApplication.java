package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
//@ComponentScan(basePackages = {"com.example.com.example.demo.controller.DemoController"})
public class DemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	 
	/**
	 * 设置上传文件的类型
	 * 注意MultipartConfigElement中的方法MaxFileSize和MaxRequestSize都是DataSize中的类型，需要转换，可以用ctrl来查看MultipartConfigFactory和DataSize中的方法
	 * @return
	 */
	@Bean
	public MultipartConfigElement multpartConfigElement() {
		 MultipartConfigFactory factory = new MultipartConfigFactory();
	        //单个文件大小200mb
	        factory.setMaxFileSize(DataSize.ofMegabytes(200L));
	        //设置总上传数据大小1GB
	        factory.setMaxRequestSize(DataSize.ofGigabytes(1L));
	        return factory.createMultipartConfig();

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
