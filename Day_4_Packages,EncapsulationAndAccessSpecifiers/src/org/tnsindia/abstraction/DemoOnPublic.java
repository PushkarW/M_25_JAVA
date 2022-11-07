package org.tnsindia.abstraction;
//Demo on public access specifier
class B
{

	public String dob="21-06-1999";
	public void display()
	{
		System.out.println("The DOB is: "+dob);
	}
}

public class DemoOnPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B p=new B();
		p.display();

	}

}
