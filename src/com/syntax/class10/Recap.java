package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		String[]disney= {"Shrek", "Elsa", "Goofy", "Mulan"};
		System.out.println(disney[1]); // Elsa
		
		// to get all elements from an array
		
		for (int i=0; i<disney.length; i++) {
			System.out.println(disney[i]+" ");
		}

		
		System.out.println("All elements using regular for loop ----");
		for(String character:disney) {
			
			if(character.equalsIgnoreCase("Shrek")) {
				System.out.println(character+ " is my favorite character");
			} else {
			
			System.out.print(character+" ");
		}
	}

}
}
