package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {

	//ctrl+space ----> auto complete
		
		int i=100;
		double d=100; //widening
		
		System.out.println(i); //100
		System.out.println(d); //100.0
		
	   long l=1000;
	   System.out.println(l);
	   
	   //byte b=130; error: cannot convert from into to byte
	   // int x=99.99 error: cannot convert from double to int
	   
	   // Type mismatch: cannot convert from double to int
	   int x=(int)99.99; //narrowing
	   System.out.println(x);
	   
	  byte b=(byte)130;
	  System.out.println(b);
	  
	  //Type mismatch: cannot convert from double to float
	  float f=10.99f;
	  System.out.println(f);
	  
	  double dd=9.99;
	  System.out.println(dd);
	  
	  double price=100;
	  System.out.println(price);
	
	   
	}

}
