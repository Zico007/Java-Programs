import java.util.Scanner;
public class StudentVerification extends StudentsPool{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome To Student Verification Portal. \n Please Enter Matric Number Of Student To Confirm Student Registration \n\n\n");
        //
		System.out.println("Enter Matric Number");
		String matric_no = in.nextLine();
		System.out.println("\n\n"+getInfo(matric_no));
	}
}


class StudentsPool{
	
	public static String getInfo(String mNo) {
		String info = null;
		int c =  studentNames().length;
		for(int i = 0; i<c; i++) {
			if(mNo.equalsIgnoreCase(studentsMno()[i])) {
				info = "Student Names : "+studentNames()[i]+"\n Matric No : "+studentsMno()[i]+"\n Department : "+studentDept()[i];
				break;
			}
			else {
				info = "Student Not Found";
			}
		}
		return info;
	}
	public static String[] studentNames () {
		String[] studentsName = {"Agbeniga Musefiu", "Olasogba Joy", "Adebayo Sulaiman"};
		return studentsName;
	}
	public static String[] studentsMno() {
		String[] studentMno = {"CSC/2017/0060", "CE/2016/0046", "BCH/2017/0056"};
		 return studentMno;
	}
	
	public static String[] studentDept() {
		String[] dept = {"Computer Science", "Computer Engineering", "BioChemistry"};
		return dept;
	}
}