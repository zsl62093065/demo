package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

/**
 * 
 * @author Administrator
 * @RunWith(SpringRunner.class) 底层启动Junit  类似于SpringMVC中的SpringJUit4ClassRunner
 * @SpringBootTest(classes= {DemoApplication.class}) 启动整个DempApplication工具
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {DemoApplication.class})
public class SpringBootTestDemo {
	/**
	 * TestCase.assertEquals  Junit4断言比较
	 */
	@Test
	public void testOne1() {
		System.out.println("test one1");
		TestCase.assertEquals(1, 1);
	}
	
	@Test
	public void testOne2() {
		System.out.println("test one2");
		TestCase.assertEquals(2, 2);
	}
	
	
	@Before
	public void testBefore() {
		System.out.println("before");
	}
	
	@After
	public void afterBefore() {
		System.out.println("after");
	}
	
	
}
