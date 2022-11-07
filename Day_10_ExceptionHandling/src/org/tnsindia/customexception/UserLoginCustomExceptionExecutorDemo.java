package org.tnsindia.customexception;

import java.util.Scanner;

public class UserLoginCustomExceptionExecutorDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		try {
			if(id!="wpushkar7@gmail.com" && password!="Pass@123")
				throw new LoginCredentials("Invalid Credentials");
			
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled "+e);
		}
		
	}

}
