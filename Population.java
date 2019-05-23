import java.util.Scanner;

public class Population {
	
	
	public static void main(String[] args) {
		int current, est, newP;
		float rate;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//
		System.out.println("Enter The Current World Population : ");
		current  = in.nextInt();
		//
		System.out.println("Enter Annual Growth Rate (In %)");
		rate  = in.nextFloat();
		//
		
		System.out.println("Estimate Population After How Years ???)");
		est  = in.nextInt();
		 System.out.println("\n\n The Current World Population is  "+current+"");
		 
		//estimate
		  for(int i =1; i<=est; i++) {
			  newP = (int) ((rate/100) * current);
			  newP = (int) (current+newP);
			  current = (int) newP;
			  System.out.printf("The World Population After %d years will be %d", i, newP);
			  	System.out.println();
		  }
		
		

	}

}
