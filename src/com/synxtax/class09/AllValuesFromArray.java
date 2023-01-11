package com.synxtax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {

		char [] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
		/*System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		 */
	
		
		for (int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		
		System.out.println();
		// I want to retrieve all elements

		
		String[] words= {"Java", "Saturday", "Day"};
		for (int i=0; i<words.length; i++);{
            // what is wrong with it 
		}
	
		/*Enhanced for loop/ advanced or for each loop
		 * CAN BE USED ONLY WHEN WE WORK WITH ARRAY OR COLLECTS.
		 * 
		 */
		
		String[] colors= {"Black", "Blue", "Green", "Gray"};

		for(String color:colors) {
			System.out.println(color+" ");
		}
	}

}
