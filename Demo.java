/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author S.O. ADEBAYO
 */
public class Demo {
    
  
	static int counter(int c) {
	return c;	
	}
	
  public static void main(String[] args) {
      //
	  	Scanner in = new Scanner(System.in);
	  	int number, counter,c;
	  	System.out.println("Enter Counter Number");
	  	c=in.nextInt();
	  	counter = counter(c);
	  	//
	  	for(int a=1; a<=counter; a++) {
	  	System.out.print("Enter A Number "+a);
	  	number = in.nextInt();
	  	
	  	//
	  	if(number % 2 == 0) {
	  		System.out.printf("/nEven number%d: %d ",a, number);
	  	}
	  	else {
	  		System.out.printf("/nOdd number%d: %d",a, number);
	  	}
	  	//
	  	System.out.println();
  }
  }
}
