import java.util.Scanner;

public class Information {

	public static void main(String[] args) {
		String fname, lname, pass;
		Scanner in = new Scanner(System.in);
		//
		System.out.println("Enter First Name");
		fname = in.nextLine();
		//
		System.out.println("Enter Last Name");
		lname = in.nextLine();
		//
		System.out.println("Enter Password");
		pass = in.nextLine();
		//
		if(validPass(pass, lname, fname)) {
			System.out.println("Password is valid");
		}
		else {
		
			System.out.println("Password is NOT valid");
			
		}
		

	}

	public static boolean validPass(String pass, String surname, String lastname) {
		//check if less than 10
		if(pass.length() < 10) {
			return false;
		}
		//check if it contains numbers and alphabets
		String numReg = ".*[0-9].*";
		String alphaReg = ".*[a-z].*";
		//
		if(!pass.matches(numReg) || !pass.matches(alphaReg)){
			return false;
		}
		//
		//check second and forth alphabets
				char s = surname.charAt(1);
				char f = surname.charAt(3);
				if (!surname.contains(""+s) || !surname.contains(""+f)) {
					return false;
				}
				
		
		return true;
	}
}
