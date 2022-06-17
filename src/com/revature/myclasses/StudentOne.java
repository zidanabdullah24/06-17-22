package com.revature.myclasses;

public class StudentOne {
	int rollNo;
	String name;
	String course;
	
public void createStudentOne(int rollNo, String name, String course ) {
	this.rollNo=rollNo;
	this.name= name;
	this.course = course;
}

public void displayStudentOne() {
	
System.out.println("Roll No: " + this.rollNo + " Name : " + this.name + " Course : " + this.course);

}
