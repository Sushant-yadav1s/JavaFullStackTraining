package com.mphasis.firstspringapp.service;

public class GreetService {
private String message;
public void init() {
	System.out.print("GreetService initialized");

}
public String getMessage() {
	return message;
}

//public void setMessage(String message) {
//	this.message = message;
//}


public void greet() {
	System.out.print(message);
}

public GreetService(String message) {
	super();
	this.message = message;
}


public void destroy() {
	System.out.print("GreetService destroyed");

}

}
