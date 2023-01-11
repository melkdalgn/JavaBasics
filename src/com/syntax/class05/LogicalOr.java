package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		

		/* Monday and Friday --> No class
		 * Tuesday and Wednesday --> Manual Testing
		 * Thursday --> Review Class
		 * Saturday and Sunday --> Java class
		 */
		
		String day="Tuesday";
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		
		} else if(day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have manual testing class");
			
		}else if(day.equals("Wednesday")) {
			System.out.println("I have review class");
		
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		
		
		} System.out.println("----------------------");
		
		/* 
		 * 
		 * 
		 */
		
			
		} 

	}


