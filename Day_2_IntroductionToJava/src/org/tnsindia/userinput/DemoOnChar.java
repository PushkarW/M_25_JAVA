package org.tnsindia.userinput;

import java.util.Scanner;

public class DemoOnChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Mobile No.: ");
		char x=s.next().charAt(3);
		System.out.println("The 4th Character is: ");
		System.out.println(x);
		s.close();
	}
}
