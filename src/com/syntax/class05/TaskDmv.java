package com.syntax.class05;

import java.util.Scanner;

public class TaskDmv {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter age");
			int age = input.nextInt();
			
			if (age >=18) { // eger 18 yas ustundeyse dmv ehliyet verecek.
				System.out.println("We will issue a DL ");
			} else {
				
			}
		}
		
		System.out.println("We will offer learner permit");	


	}
	}

	 


        // Lets do a example, bank will issue a credit card if you are over 18 if not only debit

