package com.mphasis.firstspringapp.service;

public class StudentService {
private String studentId;
private String name;
private String grade;
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}

public void display() {
	System.out.println("id: " + studentId);
	System.out.println("name: " + name);
	System.out.println("grade: " + grade);
}




}
