package com.mphasis.firstspringapp.service;

public class CarService {
	  private String model; 
	    private EngineService engine; 
	    private int year;
		public CarService(String model, EngineService engine, int year) {
			super();
			this.model = model;
			this.engine = engine;
			this.year = year;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public EngineService getEngine() {
			return engine;
		}
		public void setEngine(EngineService engine) {
			this.engine = engine;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		} 
	    

		public void display() {
			System.out.println("type: " + engine.getType());
			System.out.println("horsepower: " + engine.getHorsepower());
			System.out.println("model: " + model);
			System.out.println("year: " + year);
			
		}
		

	    
}
