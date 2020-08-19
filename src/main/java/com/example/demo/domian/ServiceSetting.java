package com.example.demo.domian;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *  服务器的名称
 * @author Administrator
 * @Component 会对主键进行扫描
 * @PropertySource 注解指定配置文件的位置
 * @ConfigurationProperties 指定配置文件的属性
 * @ConfigurationProperties(prefix="test") 将注解中的共同属性test抽离出来，可以不用@ConfigurationProperties了
 * 
 */
@Component
@PropertySource(value = { "classpath:application.properties" })
//@ConfigurationProperties
@ConfigurationProperties(prefix="test")
public class ServiceSetting {
	/**
	 * 名称
	 * 如果ServiceSetting使用注解@ConfigurationProperties(prefix="test")，那么需要注解@Value("${test.name}");
	 * 如果ServiceSetting不使用注解@ConfigurationProperties(prefix="test")，那么不需要注解@Value("${test.name}")
	 */
	//@Value("${test.name}")
	private String name;
	/**
	 * 访问接口地址
	 * 如果ServiceSetting使用注解@ConfigurationProperties(prefix="test")，那么需要注解@Value("${test.domain}");
	 * 如果ServiceSetting不使用注解@ConfigurationProperties(prefix="test")，那么不需要注解@Value("${test.domain}")
	 * 
	 */
	//@Value("${test.domain}")
	private String domain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	
	
}
