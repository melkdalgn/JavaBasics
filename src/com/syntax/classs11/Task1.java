package com.syntax.classs11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
      
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize=scanner.nextInt();
		
		System.out.println("the size of the array is + arraySize");
		int [] integerArray=new int [arraySize];
		// we can not use enhanced for loop for interesting or updating the values of an array
		System.out.println("Please enter" +arraySize+" elements");
		for (int i=0;i<integerArray.length;i++) {
			integerArray[i]=scanner.nextInt();
		}
	    System.out.println(Arrays.toString(integerArray));
	    
	    int sum=0;
	    for (int element :integerArray) { // advanced for loop
	    	sum=sum+element; // take the elements from the array one by one and add them to the sum variable
	  
	    }
	    System.out.println("The sum of all the element is" +sum);
	    scanner.close();
	}

}
