package com.revature.methods;

import java.util.Scanner;

public class MethodP {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter num1: ");
		int n1=sc.nextInt();
		System.out.print("Enter num2: ");
		int n2=sc.nextInt();
		int res=sum(n1,n2); // function call with arguments
		System.out.println("sum of " +n1 + " and " + n2 + " is " + res);
	
	}
	// fucntion definition - with parameters
		public static int sum(int x, int y) {
			int result = x + y;
			return result;
			
			
		}
		
		
	}

	

