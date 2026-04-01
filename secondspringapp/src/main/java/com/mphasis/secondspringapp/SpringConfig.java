package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.mphasis.secondspringapp.service.GreetService;
import com.mphasis.secondspringapp.service.MailServerConfig;
import com.mphasis.weatherapp.WeatherService;

@Configuration
@ComponentScan(basePackages= {"com.mphasis.secondspringapp"})
@EnableAspectJAutoProxy
public class SpringConfig {

@Bean("weatherService")
@Scope("singleton")
public WeatherService weatherservice() {
	
	
	
	return new WeatherService();
}

@Bean("mailServerConfigA")
@Primary
public MailServerConfig mailServerConfigA() {
	MailServerConfig mailServerConfig=new MailServerConfig();
	mailServerConfig.setIp("192.168.12.1");
	mailServerConfig.setLogin("Tom");
	mailServerConfig.setTokn("wjwdjjefj3");
	return mailServerConfig;
}
@Bean("mailServerConfigB")

public MailServerConfig mailServerConfigB() {
	MailServerConfig mailServerConfig=new MailServerConfig();
	mailServerConfig.setIp("192.168.12.2");
	mailServerConfig.setLogin("Test");
	mailServerConfig.setTokn("X!!@#7");
	return mailServerConfig;
}



}
