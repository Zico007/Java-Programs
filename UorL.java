import java.util.Scanner;

public class UorL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String something;
		System.out.println("Enter Somethng");
		Scanner in = new Scanner(System.in);
		something = in.nextLine();
		//
		char c =  something.charAt(0);
		System.out.println(checkCase(c));
		
	}

	public static String checkCase(char c) {
		String r;
		if(Character.isUpperCase(c)) {
			r = "The value is in uppercase";
		}
		else if(Character.isLowerCase(c)) {
			r = "The value is in lowercase";
		}
		else {
			r = "Unknown";
		}
	return r;
	}
}
