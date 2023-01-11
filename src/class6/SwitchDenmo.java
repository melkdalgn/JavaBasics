package class6;

public class SwitchDenmo {

	public static void main(String[] args) {
		
		char choice='Y';
		String meaning;
		
		// variable and matching cases must be same type
		// switch does not allow to have duplicated cases
		switch(choice) {
		
		case 'Y' :
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N' :
			meaning="No";
			break;
		default:
			meaning="Unknown";
		}
		
          System.out.println(meaning);
	}

}
