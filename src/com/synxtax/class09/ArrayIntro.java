package com.synxtax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		// create an array
		
		int[] b=new int [4];
		
		// store the values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		// access values from my array
		System.out.println(b[1]);
		System.out.println(b[1]+b[3]);
		
		// We need to create an array of my classmate of my classmates names
		// when we create an array we MUST specify the size
		// how many elements!
		// how values are stored---> stored based on index
		String[] classMates=new String[5];
		
		classMates[0]="Merve";
		classMates[1]="Erencim";
		classMates[2]="Adem salagi";
		classMates[3]="Volkansalagi";
		classMates[4]="Roman";
		classMates[5]="Cindy";
		
		System.out.println("My classmate name is"+classMates[1]);
		

	}

}
