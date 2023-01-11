package class6;

public class SwitchIntro {

	public static void main(String[] args) {
		// if its a condition based statement
	int day = 3;
	String name;
	
	if ( day ==1) {
		name="Monday";
	}else if (day ==2) {
		name="Tuesday";
	}else if (day ==3) {
		name="We dnesday";
	}else if (day ==4) {
		name="Thursday";
	}else if (day ==5) {
		name="Friday";
	}else if (day ==6) {
		name="Saturday";
	}else if (day ==7) {
		name="Sunday";	
	}else { //
		name="Invalid";
	}
		System.out.println(name);
		
		System.out.println("-----------------------------");
		
		// switch is a value based statement
		switch(day) {
		
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name = "Invalid";
			break;
		}

		System.out.println(name);
	}

}
