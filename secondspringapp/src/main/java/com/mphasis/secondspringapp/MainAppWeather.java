package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.secondspringapp.service.GreetService;
import com.mphasis.secondspringapp.service.OrderService;
import com.mphasis.weatherapp.WeatherService;

public class MainAppWeather {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext(SpringConfig.class);




		WeatherService weatherService=container.getBean("weatherService",WeatherService.class);





		weatherService.getWeather("Pune");
		container.close();
	}
}
