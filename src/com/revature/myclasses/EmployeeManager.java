package com.revature.myclasses;

public class EmployeeManager {
	public static void main(String[] args) {
		
		// create an Object of Employee class 
		Employee e1= new Employee();
		e1.createEmployee(42, "sam abdullah", "law offices", 75000);
		
		
		// create a second Object of Employee Class
		Employee e2= new Employee();
		e2.createEmployee(9, "bernie abdallah", "teacher" , 50);
		
		// create a third Object of Employee Class
		
		Employee e3= new Employee();
		e3.createEmployee(55, "suli", "engineer" , 588888);
		
		// create a fourth Object of Employee Class
		Employee e4= new Employee();
		e4.createEmployee(11, "michelle hai", "designer", 200000);
		
		// create a fifth Object of Employee 
		Employee e5= new Employee();
		e5.createEmployee(7, "rick james", "singer", 20000000);
		
		// call the display
		e1.displayEmployee();
		
		e2.displayEmployee();
		
		e3.displayEmployee();
		
		e4.displayEmployee();
		
		e5.displayEmployee();
		
		
		int []myArr=new int[5];
		Employee [] employee=new Employee[5];
		for(int i=0; i<employee.length; i++)
			employee[i]=new Employee();
		
		
	}

}
