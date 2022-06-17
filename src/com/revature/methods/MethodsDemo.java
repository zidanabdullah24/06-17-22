package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo {
public static void main(String[] args) {
	sum(); //method call
}

	// method definition 
	
	private static void sum() {
	// TODO Auto-generated method stub
	
}



	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number 1: ");
	int n1=sc.nextInt();
	System.out.print("Enter Number 2");
	int n2=sc.nextInt();
	int result+n1+n2;
	System.out.println("Sum of " +n1 " and "+n2+" = "+result");
}

}
