package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		
		/* declera a secret number;
		 * you want to ask user to guess your secret number
		 * you code should keep asking to guess until user gets your secret number
		 * you code should keep asking to guess till user gets your secret numnber
		 * once user gets the secret number you got it
		 */
		
		int secretNum = 55;
		int guessedNum;
		
		Scanner scan = new Scanner (System.in);
		
		do {
		System.out.println("Guess my secret number");
		guessedNum= scan.nextInt();
		}while(guessedNum != secretNum);
		
		System.out.println("You got it");

	}

}
