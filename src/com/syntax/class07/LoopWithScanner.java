package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		/* We are going to ask if you get a job and we will continously keep asking
		 * get a job until you say yes
		 * once you say yes then
		 * CONGRATULATIONS!
		 */
		
		
		Scanner scan=new Scanner(System.in);
		String job;
		
		do {
		    System.out.println("Did you get a job");
		    job=scan.next();
		}while(!job.equalsIgnoreCase("yes"));
		
		System.out.println("Congrulations");
		
		System.out.println("-------------------------");
		
		Scanner input=new Scanner(System.in);
		String offer;
		System.out.println("Did you get a job");
		offer=input.next();
		
		while(!offer.equalsIgnoreCase("yes")); {
			
		}
		
		

	}

}
