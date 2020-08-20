package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
/**
 * 
 * @author Administrator
 * mockMvc.perform是模拟客户端往服务端发送请求
 * andExpect 添加ResultMatcher-->MockMvcResultMatchers 验证规则
 * andReturn  最后返回相应的MvcResult
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {DemoApplication.class})
@AutoConfigureMockMvc
public class MockMvcTestDemo {

	@Autowired
	private MockMvc mockMvc;
	
	public void apiTest() throws Exception{
		MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/test/home"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn()
				;
		int  status=mvcResult.getResponse().getStatus();
		System.out.println("输出状态码："+status);
	}
	
}
