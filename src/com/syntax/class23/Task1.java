package com.syntax.class23;

public class Task1 {

	public static void main(String[] args) {
		
		
		
		class Degree {
			void getPrerequisite() {
				System.out.println("To get a degree you need high school diploma");
			}
		}

		class Bachelors extends Degree {
			
		}
	
		class Masters extends Degree{
			@Override
			void getPrerequisite() {
				System.out.println("To get a Masters degree you need Bachelors degree first");
			}
			
		
		}

		
	}

}
