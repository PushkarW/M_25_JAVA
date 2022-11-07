package org.tnsindia.statickeyword;
class A
{
	//non -sttaic method
	int add(int a,int b)
	{
		return a+b;
	}
	//static method
	public static void display()
	{
		System.out.println("Welcome to Java Full stack training");
	}
}
public class DemoONStaticMethod {

	public static void main(String[] args) {
		A.display();

	}

}
