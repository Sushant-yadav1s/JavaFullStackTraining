package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.OrderService;
import com.mphasis.firstspringapp.service.StudentService;

public class MainAppStudent {
public static void main(String[] args) {
	ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");

	StudentService studentService=container.getBean("studentService",StudentService.class);
	studentService.display();
	
	container.close();
	
	container.registerShutdownHook();
}
}
