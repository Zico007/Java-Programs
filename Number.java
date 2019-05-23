import java.util.Random;

public class Number {

	public static void main(String args[]) {
		iGuessedIt();
	}
	
	static void iGuessedIt() {
		Random ran = new Random();
		int random;
		int sum = 0;
		for(int i = 1; i<=50; i++) {
			random =  ran.nextInt((50-1) + 1);
			if(random <=50) {
			System.out.printf(i+". Random No %d", random);
			System.out.println();
			sum +=random;
			}
		}
		System.out.println();
		System.out.printf("The sum of everything is %d", sum);
		
	}
}
