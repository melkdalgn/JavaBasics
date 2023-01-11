package com.syntax.class03;

public class RelationalOperatorsPractice {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2); //false
		System.out.println(num1<num2); //true
		System.out.println(num1<=num2); //false
		System.out.println(num2>=num1); //true
		System.out.println(num2!=num1); //true

		System.out.println(num1==num2);
		System.out.println(num1=num2); //reassigning 
		System.out.println(num1==num2); // will be true because when i reassign it result was 22 and 22=22
		 
		int a=30;
		int b=40;
		
		System.out.println(a<b); //true
		System.out.println(b>a); //true
		System.out.println(a<=b); //true etc...
		
		boolean result=100<200;
		System.out.println(result); //true
		
		int num3=10;
		int num4=11;
		
		result=num3==num4;
		System.out.println(result); //false
		
		result=num3!=num4;
		System.out.println(result); //true 
	

	}

}
