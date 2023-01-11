package com.syntax.class01;

public class DataTypesPractice {

	public static void main(String[] args) {
		
		//whole numbers
		/* to create a variable we need 2 things: datatype & name
		 * 
		 * 
		 */
		
		byte box1= 27;
		short box2=32453;
		int box3=672323;
		long box4= 723273423;
		
		
		// byte is a value but we have to store them in variable
		

		// decimal values
		
		double container2=89.9;
		
		//to represent one character use char
		
		char gender='f';
		char dollar='$';
		
		// to represent true or false
		
		boolean hungry=true;
		boolean sleepy=false;
		
		//how to access values from variables
		
		System.out.println(container2); // do not use "" to access variables
		
		// access and print values from all variables
		
		
		//Numerics
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		
		//Decimal
		
		System.out.println(gender);
		System.out.println(dollar);
		
		//true or false
		
		System.out.println(hungry);
		System.out.println(sleepy);
		
		int box5=900;
		System.out.println(box5);
		
		int year=2022;
		System.out.println(year);
		
		year=2023; // reassigning the value of the same box
		System.out.println(year);
	}

}
