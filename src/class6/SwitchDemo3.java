package class6;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		/* lets ask a user where us he from
		 * based on the country we will define favorite food
		 * 
		 */
		
		Scanner scan=new Scanner (System.in);
		

		System.out.println("Please tell me where are you from");
		String country=scan.nextLine();
		String favoriteFood= scan.nextLine();
		
		switch(country) {
		
		case "Mexico":
		    favoriteFood="tacos";
		    break;
		case"Canada":
			favoriteFood="poutine";
			break;
		case"Turkey":
			favoriteFood="lahmacun";
			break;
		case"Pakistan":
			favoriteFood="pati chai";
			break;
		case"Egypt":
			favoriteFood="koshary";
			break;
		case"USA":
			favoriteFood="burgers";
			break;
		default:
			favoriteFood="unknown";		    
		    
	     }
		
         System.out.println("You are from " +country+ " and your favorite food is" +favoriteFood);	
	}
	
	

}
