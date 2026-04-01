package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.CarService;
import com.mphasis.firstspringapp.service.EngineService;
import com.mphasis.firstspringapp.service.OrderService;

public class MainAppCar {
public static void main(String[] args) {
	ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
//	GreetService greetService=container.getBean("greetService",GreetService.class);
//	
//	greetService.greet();
	CarService carService=container.getBean("carService",CarService.class);
	carService.display();



	container.close();
	
	container.registerShutdownHook();
}
}
