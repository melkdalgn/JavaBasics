package class6;

public class EnhancedLargestNumber {

	public static void main(String[] args) {

		int num1 = 200;
		int num2 = 200;
		int num3 = 2000;
		
		
		/* compiler can initialize variables to its default
		 * int -> 0
		 * double -> 0.0
		 * boolean -> false
		 * String -> null
		 */
		
		int largest = 0;
		
		if (num1 > num2 && num1 > num3) {
			largest = num1;
			
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
			
		}else if (num2 > num1 && num2 > num3) {
			largest = num2;
			
		}else {
			System.out.println("All numbers are equal");
		}
		
		if (largest !=0) {  
			System.out.println("The largest number is" +largest);
			// The variable largest is not initalized
			
			
			
		}
	}

}
