package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;

@RestController
//RestController返回一个json格式给前端
public class StudyController {

		private  Map<String,Object> params=new HashMap<>();
		
		/**
		 * 功能描述：测试restful协议，从容器中获取字段
		 * path之中目前都是用下划线连接字段，而不是驼峰，因为某些协议不支持驼峰
		 *  访问路径 http://localhost:8080/武汉/金茂
		 * @param cityId
		 * @param userId
		 * @return
		 */
	/*
	 * @RequestMapping(path="/{city_id}/{user_id}",method=RequestMethod.GET) public
	 * Object findUser(@PathVariable("city_id") String
	 * cityId,@PathVariable("user_id") String userId) { params.clear();
	 * params.put("cityId", cityId); params.put("userId", userId); return params; }
	 */
		
		/**
		 * 功能描述，测试GetMapping
		 * 访问地址：http://localhost:8080/v1/pageUser?cityId=武汉&userId=李明
		 * @param cityId
		 * @param userId
		 * @return
		 */
		@GetMapping(value="/v1/pageUser")
		public Object pageUser(String cityId,String  userId) {
			params.clear();
			params.put("cityId", cityId);
			params.put("userId", userId);
			System.out.println("热部署输出cityId"+cityId+",热部署输出userId"+userId);
			System.out.println("热加载3");
			return params;
			
		}
		/**
		 * 功能描述：默认值，不传参数cityId的时候，cityId默认值是金茂
		 * 访问地址：http://localhost:8080/v1/pageUser2?userId=李明
		 * @param cityId
		 * @param userId
		 * @return
		 */
		@GetMapping(value="/v1/pageUser2")
		public Object pageUser2(
				@RequestParam(defaultValue="金茂",name="cityId",required = true)
				String cityId,String  userId) {
			params.clear();
			params.put("cityId", cityId);
			params.put("userId", userId);
			return params;
			
		}
		
		/**
		 * 必须先创建一个User类，给它赋予一些属性
		 * 功能描述：bean对象传参
		 * postman测试接口的时候请求头指为：Content-Type：application/json
		 * 请求方式是get
		 * 请求地址是http://localhost:8080/v1/save_user
		 * 请求参数是:
		 * {
    	*	"name":"李明",
    	*	"age":22,
   		*	"sex":"男",
    	*	"money":"2000"
		*	}
		 * 
		 *
		 * @param user
		 * @return
		 */
		@RequestMapping("/v1/save_user")
		public Object saveUser(@RequestBody User user) {
			params.clear();
			params.put("user", user);
			return params;
			
		}
		/**
		 * 测试http的头部信息
		 * 访问地址：http://localhost:8080/v1/getHeader?id=9
		 * 头部配置中access_token填入对应的值123456
		 * @param token
		 * @param id
		 * @return
		 */
		@GetMapping("/v1/getHeader")
		public Object getHeader(@RequestHeader("access_token") String token,String id) {
			params.clear();
			params.put("access_token", token);
			params.put("id", id);
			return params;
			
		}
		
		
		/**
		 * servlet的请求方式
		 * 访问地址：http://localhost:8080/v1/servletTest?id=9
		 * @param request
		 * @return
		 */
		@GetMapping("/v1/servletTest")
		public Object servletTest(HttpServletRequest request) {
			params.clear();
			String id=request.getParameter("id");
			params.put("id", id);
			return params;
			
		}
		
		
}
