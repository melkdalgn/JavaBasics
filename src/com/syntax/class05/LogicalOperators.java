package com.syntax.class05;

public class LogicalOperators {

	public static void main(String[] args) {

		boolean job= true;
		double salary= 100000;
		
		if (job && salary>=100000) {
			System.out.println("I am depressed as fuck");
			
		}
		
		System.out.println("------------");
		
		boolean study=true;
		boolean homework=true;
		boolean practice=true;
		
		if(study && homework && practice) {
			System.out.println("You will succeed in the course");
		}else {
			System.out.println("You will struggle");
			
			
			
			int num1=65;
			int num2=66;
			int num3=23;
			
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number 1 " + num1);
			
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The largest number is " + num3);
			
		}else if (num2> num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);
			
		}
			
					
		}}}

	
