package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		
		// I need to print numbers from 1 to 90
		
		for (int i=1; i<=90; i++) {
			System.out.println(i+ " "); 
		
		}

		/*start point
		 * end point
		 * increment/ decrement
		 */
		
		// I need numbers from 60 to 10
		
		for (int i=60; i>=10; i--) {
			System.out.println(i+" ");
		}
	   System.out.println();
	   // what is the output ?
	   
	   for (int i=5; i<40; i+=5) {
		   System.out.println(i+" ");
	   }
	   // Print even numbers 20 to 1 (2 ways)
	   for (int a =20; a >=1; a-=2) {
		   System.out.print(a + " ");
	  
	   }
	System.out.println();
	for ( int m =20; m>=1; m--) {
		
		if (m % 2 ==0) {
			System.out.print(m+ " ");

		}
	
	
	}
	
	System.out.println();
	// Print odd numbers between 20 to 50 ( 2 ways)
	
	for (int i = 21; i<= 50; i+=2) {
		System.out.print(i + " ");
		
	}
	 System.out.println("--- 2 way -----");
	 
	 for (int i =21; i< 50; i++) {
		 if (i %2 ==0) {
			 System.out.println(i + " ");
	 }
	 
	 }
	
	
	}
	
}
