package com.syntax.class03;

public class PrimitiveCastingPractice {

	public static void main(String[] args) {
		
		//Widening kucukten buyuge
	int i=100;
	double d=100; //
	
	System.out.println(i);
	System.out.println(d);
	
	//Narrowing, buyukten kucuge
	
	int x=(int)99.99;
	System.out.println(x);
	
	byte b=(byte)130;
	System.out.println(b); // byte represent small numbers we are converting byte to widening


	float f=10.99f; //- Type mismatch: cannot convert from double to float
	System.out.println(f);
	
	 
	}

}
