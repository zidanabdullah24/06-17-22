package com.revature.arrayassignment;

public class Array {
	public static void main(String[] args) {
		
		int marks[]= new int[10];
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,10};
		
		
		marks[0]=45;
		marks[1]=887;
		marks[2]=87;
		marks[3]=74;
		marks[4]=24;
		marks[5]=22;
		marks[6]=89;
		marks[7]=33;
		marks[8]=251;
		marks[9]=100;
		
		System.out.println("length of Marks Array: " +arr2.length);
	
		for(int i=0; i<10;i++)
			System.out.println(marks[i]);
		
		for(int j=0;j<marks.length;j++)
			System.out.println(j);
		
		// Enhanced for Loop
	}

}
