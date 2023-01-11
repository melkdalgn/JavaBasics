package com.syntax.class02;

public class NonPrimitives {
	
	public static void main(String[] args) {

		String name="Melike ";
		String lastName="Dalgin ";
	    String phoneNumber="201-790-2941";
	    String address="511 Dewey Avenue";
		String age="21";
		String city= "Cliffside Park";
		
		//shortcuts for printing
		//type syso +ctrl space+ ----> hit enter
		
		System.out.println(name+lastName); 
		System.out.println(phoneNumber+address);
        
		/*we can use + --> works as concatenation operator
		 * when we want to attach String to String
		 *              to attach String to int
		 *              to attach String to double
		 *              to any other type
		 */
		
	
		// Melike lives in Cliffside Park
        System.out.println(name+" lives in "+city);	
        
        //Melike is 21 years old
        System.out.println(name+" is "+age+"years old");
        
        //
        
        String words="years old";
        System.out.println(name+" is "+age+" "+words);
        
        /*
         * Rules for identifiers
         * 1.no space
         * 2.no keywords
         * 3.cannot start with number (numbers can be used after the first letter)
         * 4.cannot have with special character (except _,$)
         */
        
        // String break="Hello";
       //  int 1number=10;
        int number1=10;
        System.out.println(number1);
        
        //int num%=20 
        double $price=3.00;
        float f_=2.09f;
        System.out.println($price);
        System.out.println(f_);
        
      
        
       /* Naming Conventions
        * follow camel casing
        * variables names should start with lower case and then follow camel casing
        */
        
        String MyCity="Istanbul";
        System.out.println(MyCity);
	
        
	
	
	
	}

}
