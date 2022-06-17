package Method1;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		sum(); // method call
		sub(); // method call
		multiply(); // method call
		divide(); // method call
	}
	//method definition
	public static void sum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1 =sc.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=sc.nextInt();
		int result=n1+n2;
		System.out.println("sum of " + n1 + " and " + n2 + " = " +result);
	}
		public static void sub() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number 1: ");
			int n1 =sc.nextInt();
			System.out.print("Enter Number 2: ");
			int n2=sc.nextInt();
			int result=n1-n2;
			System.out.println("sub of "+ n1 + " and " + n2 + " = " +result);
			
		}
			public static void multiply() {
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Number 1: ");
				int n1 =sc.nextInt();
				System.out.print("Enter Number 2: ");
				int n2=sc.nextInt();
				int result=n1*n2;
				System.out.println("mulitply of " + n1 + " and " + n2 + " = " +result);
			}
				public static void divide() {
					
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter Number 1: ");
					int n1 =sc.nextInt();
					System.out.print("Enter Number 2: ");
					int n2=sc.nextInt();
					int result=n1/n2;
					System.out.println("divide of " + n1 + " and " + n2 + " = " +result);
		}
		}


