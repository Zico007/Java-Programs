import java.util.Scanner;

class Semester {
	public int noofsemesters;	
	public Semester(int ns) {
		noofsemesters = ns;
	
	}
      public int getNoOfSemesters() {
    	  return noofsemesters;
      }
	
}


class Courses extends Semester {
	public String grade;
    public int courseunit;
    public int courseno;
    
    public Courses(int ns, String g, int cu, int cn) {
		super(ns);
		grade =  g;
		courseunit =  cu;
		courseno = cn;
	}
    public int getNoOfCourse() {
    	return courseno;
    }
}
	


class CGPA {
	public int totalunits;
	public int totalpoints;
	//
	public CGPA(int tu, int tp) {
		totalunits = tu;
		totalpoints = tp;
	}
	
	public float getCGPA() {
		float cgpa = totalunits/totalpoints;
		return cgpa;
	}

}


public class CGPA_Calc {

	
	public static int gradeToPoint(String g) {
		int p;
		if(g.equals("A")) {
			p = 5;
		}
		else if(g.equals("B")) {
			p = 4;
		}
		else if(g.equals("C")) {
			p = 3;
		}
		else if(g.equals("D")) {
			p = 2;
		}
		else if(g.equals("E")) {
			p = 1;
		}
		else if(g.equals("F")) {
			p = 0;
		}
		else {
			p = 0;
		}
		return p;
	}
	
	public static void main(String[] args) {
		int ns, c, cu, a, b;
		String g;
		//
		int totalp = 0;
		int totalu = 0;
		//
	 Scanner in = new Scanner(System.in);
	 //
	 System.out.println("Enter Number Of Semesters");
	 ns = in.nextInt();
	 Semester se = new Semester(ns);
	 //
	 for(a= 1; a<=se.getNoOfSemesters(); a++) {
		 //
		 System.out.println("Enter No Of Course For Semester "+a);
		c = in.nextInt();
		//
			for(b = 1; b<=c; b++) {
				//
				System.out.println("Enter Grade For Course "+b);
				 g = in.nextLine();
				 totalp +=gradeToPoint(g);
				 //
					System.out.println("Enter Unit For Course "+b);
					 cu = in.nextInt();
					 //
					 totalu +=cu;
				
				
			}
		 
		 
	 }
	 //
	 CGPA cgpa = new CGPA(totalu, totalp);
	 System.out.println("The CGPA After "+se.getNoOfSemesters()+" Semesters is "+cgpa.getCGPA());
	 
	 

	}

}
