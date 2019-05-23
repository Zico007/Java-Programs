import java.util.Scanner;

public class BlockChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Numbers");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//
		if(iAmStrong(n)) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is NOT Armstrong");
		}

	}
	
	public static boolean iAmStrong(int n) {
		
		int sum = 0;
		for(int i =0; i<String.valueOf(n).length(); i++) {
			char single =  String.valueOf(n).charAt(i);
			int s =  Character.getNumericValue(single);
			int mul = (s * s * s);
			sum +=mul;
			
		}
		//
		if(sum == n) {
			return true;
		}
		
		return false;
	}

}
