package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++); {
			System.out.println("Hello"); // outer loops
			
			
			for (int y=1; y<=3; y++) { // nested loops
				System.out.println("Bye");
			}
		}
		
		for (int i=1; i<=3; i++) { // outer loops controls inner loop
			System.out.println("i");
			
			for (int y=1; y<=2; y++) { // inner loop depends on the outer loop
				System.out.println("y");
			}
		}

		for (int i=1; i<=3; i++) {
			for (int y=1; y<=3; y++) {
				System.out.println(i+" "+y);
			}
		}
	
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello"); 
			
			for (int y=1; y>=2; y++) {
				System.out.println("Bye");
			}
	
		}

		for (int i=1; i>3; i--) { // outer loop
			System.out.println("Hello");
			
			for (int y=1; y<=2; y++) { // inner loop
				System.out.println("Bye"); 
			}
		}
	}
		
	}


