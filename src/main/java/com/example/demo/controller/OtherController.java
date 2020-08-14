package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 主要是用来测试post、put、delete请求
 * @author Administrator
 *
 */
@RestController
public class OtherController {

	private  Map<String,Object> params=new HashMap<>();
	
	/**
	 * post请求
	 * 请求地址：http://localhost:8080/v1/login
	 * 一般通过postman验证的时候,需要在body下面的x-www-form-urlencoded中输入对应的user_name 和paasword的值
	 * @param user_name
	 * @param paasword
	 * @return
	 */
	@PostMapping("/v1/login")
	public Object login(String user_name,String paasword) {
		params.clear();
		params.put("user_name", user_name);
		params.put("paasword", paasword);
		return params;
		
	}
	
	/**
	 * put操作是用来更新的
	 * 请求地址：http://localhost:8080/v1/put?user_name=金茂&paasword=654321
	 *
	 * @param user_name
	 * @param paasword
	 * @return
	 */
	@PostMapping("/v1/put")
	public Object put(String user_name,String paasword) {
		params.clear();
		params.put("user_name", user_name);
		params.put("paasword", paasword);
		return params;
	}
	
	
	/**
	 * delete主要用于删除
	 * 请求地址：http://localhost:8080/v1/del?id=25
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("/v1/del")
	public Object del(String id) {
		params.clear();
		params.put("id", id);
		return params;
	}
	
}
