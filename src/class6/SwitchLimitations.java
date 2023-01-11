package class6;

public class SwitchLimitations {

	public static void main(String[] args) {

		/*switch can work with byte, short, int, char, string
		 * switch has a data type limitations
		 * switch can not work with double, float, long, boolean
		 */
		
		double price=10;
		
		/*
		 * switch(price) { // CE: Cannot switch on a value of type double.
		 }
	
		 */
		
		boolean hungry=true;
		/*
		 * switch(hungry) { -> CE: Cannot switch on a value of type boolean
		 */
		
		/*
		 * switch has a operators limitations
		 * 
		 */
	char choice= 'Y';
	String meaning;
	
	/*switch(choice) {
	 */
	
	/*
	 * case 'Y' || 'y': --> CE: cannot use ||
	 *meaning="Yes";
		break;
	 */
	
     int day =5;
     
     /*
      * 
      */

	
	}
	
	
	

}
