package com.mphasis.firstspringapp.service;

public class EngineService {
	private String type; 
	private int horsepower;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public EngineService(String type, int horsepower) {
		super();
		this.type = type;
		this.horsepower = horsepower;
	}
	public void display() {
		System.out.println("type: " + type);
		System.out.println("horsepower: " + horsepower);
		
	}
	
}
