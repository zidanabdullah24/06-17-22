package com.revature.mypackage;

public class ArraysDemo {
public static void main(String[] args) {
	
	int marks[]=new int[5];
	
	int[] arr2= {1,2,3,4,5};
	
	
	marks[0]=10;
	marks[1]=12;
	marks[2]=14;
	marks[3]=16;
	marks[4]=17;
	
	System.out.println("length of Marks Array: " +arr2.length);
	
	
	for(int i=0; i<5;i++)
		System.out.println(marks[i]);
	
	for(int j=0;j<marks.length;j++)
		System.out.println(j);
	
	
		
	
}

}
