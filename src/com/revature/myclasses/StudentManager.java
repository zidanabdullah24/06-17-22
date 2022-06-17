package com.revature.myclasses;

public class StudentManager {
	public static void main(String[] args) {
		
		// Create of an Object of StudentOne class
		StudentOne s1=new StudentOne();
		
		s1.createStudentOne(101, "Zidan" , "Java");
		
		// create a second object
		StudentOne s2=new StudentOne();
		s2.createStudentOne(102, "Mathew", "AWS");
		
		// call the display
		s1.displayStudentOne();
		s2.displayStudentOne();
		
	}

}
