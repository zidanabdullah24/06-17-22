package com.revature.myclasses;

public class Employee {
	
	int idNo;
	String name;
	String dept;
	double salary;
	
public void createEmployee(int idNo, String name, String dept, double salary) {

	this.idNo= idNo;
	this.name= name;
	this.dept= dept;
	this.salary= salary;
}
public void displayEmployee() {
	System.out.println("Id No: " + this.idNo + " Name : " + this.name + " Dept : " + this.dept + "Salary : " + this.salary);
	
}

}


	
	
	
