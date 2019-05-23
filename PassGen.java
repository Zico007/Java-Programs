import java.util.Random;

public class PassGen {

	public static void main(String[] args) {
		int i;
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		//
		StringBuilder sb = new StringBuilder();
		int n = 10; // how many characters in password
		String set = lower+digits; // characters to choose from
			Random rnd = new Random();
		for (i= 0; i < n; i++) {
		    int k =  rnd.nextInt((set.length()-1) - 0 + 1) + 0; //
		    sb.append(set.charAt(k));
		}
		String result = sb.toString();
		System.out.print(result);
	}

}
