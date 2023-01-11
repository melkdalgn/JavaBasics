package com.syntax.class03;

public class IfStatementPractice {

	public static void main(String[] args) {
		
		double iceCream=5;
		if(iceCream>3) {
			System.out.println("I am not buying ice cream");
		}

		double vape=15; //true 
		if(vape>10) {
			System.out.println("I will buy vape");
	
		}
	
		double busTicket=7;
		if (busTicket>5) {
			System.out.println("I will purchase bus ticket ");
		}
	
		int num1=30;
		int num2=50;
		
		if(num2>num1) {
			System.out.println(num1+ " smaller than" +num2);
		}
	
		
		int temperature=78;
		if(temperature< 75) {
			System.out.println("I will go for a walk");
		} else {
			System.out.println("I am going to study");
		}
		
		char gender='m';
		if(gender=='f') {
			System.out.println("You like shopping"); 
			
		}else { System.out.println("You like watching sport");
			
		}
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("All test cases will be executed on chrome"); 
				
			}else {
				System.out.println("I am not executing any test cases");
			}
		}
	}
	

	


