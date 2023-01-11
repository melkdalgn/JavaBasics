  package com.syntax.class07;

import java.util.Scanner;

public class HWDiscount8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale? Please enter yes or no");
		String sale = input.next();
		double price = 0.00, discount = 0.00, salePrice = 0.00;
		
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("Which product do you wish to purchase?");
			String product = input.next();
			System.out.println("Please enter the price of the product");
		
			price = input.nextDouble();
			if (price < 20) {
				discount = 10;
				salePrice = price - (price * 0.1);
			}else if (price >= 20 && price <=100) {
				discount = 20;
				salePrice = price - (price * 0.2);
			}else if (price >= 101 && price <=500) {
				discount = 30;
				salePrice = price - (price * 0.3);
			} else {
				discount = 50;
				salePrice = price - (price * 0.5);
					
			}
			System.out.println("After a discount of " + discount + "the price of the product" + "to " +salePrice);
			
		}else {
			System.out.println("There is no sale, so you are not going to shopping");
			
		}
	}
}
