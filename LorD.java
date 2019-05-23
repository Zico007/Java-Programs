import java.util.Scanner;

public class LorD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String something;
	
		System.out.println("Enter Somethng");
		Scanner in = new Scanner(System.in);
		something = in.nextLine();
		//
		char c =  something.charAt(0);
		System.out.println(checkType(c));
	
	}
	
	public static String checkType(char c) {
		String r;
		if(Character.isLetter(c)) {
			r = "The value entered is a letter";
		}
		else if(Character.isDigit(c)) {
			r = "The value entered  is a digit";
		}
		else {
			r = "Unknown";
		}
	return r;
	}

}
