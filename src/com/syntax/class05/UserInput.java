package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter name");
			String name=scan.next();
			System.out.println(name);
			
			System.out.println("Please enter age");
			int age=scan.nextInt();
			System.out.println(age);
			
			System.out.println("Please enter price");
			double price=scan.nextDouble();
			System.out.println(price);
			
			System.out.println("Please enter boolean");
			Boolean belasi=scan.nextBoolean();
			System.out.println(belasi);
			
			System.out.println("Please enter any character");
			char character=scan.next().charAt(0);
			System.out.println(character);
		}
		
	}
		

	}


