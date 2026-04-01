package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.GreetService;
import com.mphasis.firstspringapp.service.MailServerConfig;

public class MainAppGreetService {
public static void main(String[] args) {
	ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
//	GreetService greetService=container.getBean("greetService",GreetService.class);
//	
//	greetService.greet();
	MailServerConfig mk=container.getBean("mailService",MailServerConfig.class);
	
	
	
	container.registerShutdownHook();
	
}
}
