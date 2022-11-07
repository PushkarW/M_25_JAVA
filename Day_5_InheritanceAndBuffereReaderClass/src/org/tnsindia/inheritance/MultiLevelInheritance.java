package org.tnsindia.inheritance;
class Vehicle
{
	private String name;
	//if this method is private we can't access into another class
	public void display()
	{
		System.out.println("Vehical Type: " +name);
	}
}
//Child Class For Vehicle
class BMW extends Vehicle
{
	private  String Brand;
	public void display1()
	{
		System.out.println("Brand Name: "+Brand);
	}
	
}
//Child Class For BMW
class Tyre extends BMW
{
	private String tyrename;
	public void display2()
	{
		System.out.println("Tyre Brand Used: "+tyrename);
	}
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Tyre t=new Tyre();
		t.display();
		t.display1();
		t.display2();
		

	}

}
