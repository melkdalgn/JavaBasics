package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		int day = 3;
		String isim;
		
		if ( day ==1) {
			isim="Monday";
		}else if (day ==2) {
			isim="Tuesday";
		}else if (day ==3) {
			isim="Wednesday";
		}else if (day ==4) {
			isim="Thursday";
		}else if (day ==5) {
			isim="Friday";
		}else if (day ==6) {
			isim="Saturday";
		}else if (day ==7) {
			isim="Sunday";	
		}else { //
			isim="Invalid";
		}

		System.out.println("isim");
	}

}
