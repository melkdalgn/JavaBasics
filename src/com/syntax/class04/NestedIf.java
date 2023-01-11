package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccination=true;
		int dose=1;
		if(vaccination) {
			System.out.println("Let me check if  you got second does");
			
			if(dose==1) {
				System.out.println("you need one more dose");
				
			} 
		}System.out.println("------------");
		
		boolean medication = true;
		int medicationDose = 1;
		if(medication) {
			System.out.println("I am taking medications");
			
			if (medicationDose == 1) {
				System.out.println("Only one dose of med");
			}
			
			boolean sevgilinVarmi = true;
			int kacTaneVar = 1;
			
			if(sevgilinVarmi) {
				System.out.println("Bir tanecik erenim var");
				if(kacTaneVar == 1) {
					System.out.println("Bir");
				}
			}
			
			System.out.println("-----------");
			
			String month="May"; 
			int day=8;
			if (month.equals("May")) {
				 
				System.out.println("Let me check today is date");
				
				if (day==8) {
					System.out.println("Today is a Mothers Day");
				}
			}
					 
			String week="Tuesday";
			int weekDay=2;
			if(week.equals("Monday")) {
				System.out.println("Monday");
				if(weekDay==1) {
					
					System.out.println("The worst day of the week");
				} 
				
			} else if (week.equals("Tuesday")) {
				System.out.println("Tuesday");
				if(weekDay==2) {
					System.out.println("Second day of the week");
				}
			}
			
		
			String favMonth="April";
			int birthDay=30;
			if(favMonth.equals("April")) {
				System.out.println("April 19th");
				if(birthDay==30) {
					System.out.println("is my birthday");
				}
			} else if(favMonth.equals("May")) {
				System.out.println("Eren's birthday");
				if(birthDay==30) {
					System.out.println("is on April 30th");
				}
			}
			
			
			
		}
		
	}}


