package com.syntax.class04;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean job=true;
		double salary=10000;
		
		if(job && salary<=10000) {
			System.out.println("Mutlu olurum aga");
		}

		System.out.println("---------------");
		
		boolean study=true;
		boolean homework=false;
		boolean practice=true;
		if(study && homework && practice) {
		System.out.println("I will succeed in the course");
		
		} else {
			System.out.println("Nah is bulursun");
			
		}
		System.out.println("------------------");
		
		int num1=65;
		int num2=66;
		int num3=23;
		
		if(num1<num2 && num1>num3) {
			System.out.println("The largest number is" + num1);
		
		}else if (num3>num1 && num3>num2) {
			System.out.println("The largest number is " + num3);
		
		}else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is " +num2);
		}
		
		
		
		
	}

}
