package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {

		/*
		 * declare a variable rate.
		 * If rate is more than 5 --> I am not buying a house
		 */
	
	double mortgageRate=4.5;
	
	if (mortgageRate>5){
		
		System.out.println("I am not buying a house");
	}
	
	/*declare 2 variables and check if num1 is bigger than num2
	 * 
	 * 
	 */
	
	int num1=99;
	int num2=10;
	
	if(num1>num2) {
		System.out.println(num1+" is bigger than "+num2);
	}
	
	/*
	 *  declare temperature,
	 *  if higher than 75 -> I will go for a walk
	 */
	
	int temp=88;
	
	if(temp>75) { // code goes inside if  {}
		          // when condition is true
		
		System.out.println("I will go for a walk");
	}else { //otherwise. Code comes to else {}
		   // when condition is false
		
		System.out.println("I am going to study Java");
		
	}
	
	System.out.println( "---------------------" );
	
	char gender='m' ;
	if (gender=='f'); {
		
	   System.out.println("You like shopping");
	   
	} {
		 
		System.out.println("You like watching sports"); }
	
	}
	
	{System.out.println(" -------------- ") ;
	
	String browser="Chrome";
	
	if (browser.equals("chrome")) {
		
		System.out.println("All test cases will be executed on chrome");
	}else {
		
		System.out.println("I am not executing any test cases");
	    System.out.println("Reason - wrong browser");
	}
	
}
}	
	
	
	
	
	

