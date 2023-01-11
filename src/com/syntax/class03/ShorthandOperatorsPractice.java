package com.syntax.class03;

public class ShorthandOperatorsPractice {

	public static void main(String[] args) {
		
		int num=100;
		num=num+100;
		System.out.println(num); //200 
		
		num=num+50;
		System.out.println(num); //250
		
		num+=100; // num=num+100;
		
		//- sub
		
		num-=10;
		System.out.println(num); //340
		
		num/=10; // 340 bolu 10 esittir 34
		 
		num*=2; // 34 carpi 2 68 esit olur
		
		System.out.println(num);

		num%=2;
		System.out.println(num); //0 0.68
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a); //30
		
		a+=b+c;
		System.out.println(a); //50
		
		a*=10;
		System.out.println(a); //800
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int sayisi=500;
		int sayisi1=200;
		sayisi+=sayisi1;
		System.out.println(sayisi+sayisi1);
		
		int cake=25;
		System.out.println(cake/7);
		cake%=7;
		System.out.println(cake);
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
