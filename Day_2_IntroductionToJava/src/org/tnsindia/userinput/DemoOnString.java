package org.tnsindia.userinput;

import java.util.Scanner;

public class DemoOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Full Name: ");
		//the difference between next() and nextLine()
		/*next() will take only the first word of your sentence and
		 * nextLine() will take the complete sentence*/
		String x=s.next();
		System.out.println("First Name: ");
		System.out.println(x);
		s.close();

	}

}
