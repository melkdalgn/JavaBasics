package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);

		
		/* If there is no traff ill be on time for work
		 * 
		 */
		
		boolean traffic=false;
		if(!traffic) {
			System.out.println("Ill be on time for work");
		}
	
		String name="idk";
		if(!name.equals("Eren")) {
			System.out.println("You are not eren i need eren");
		}
	
	
	
	}
	
	

}
