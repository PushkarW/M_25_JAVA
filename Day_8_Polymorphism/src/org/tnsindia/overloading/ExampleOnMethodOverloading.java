package org.tnsindia.overloading;

import java.util.Scanner;

//Demo on method overloading -by changing the no. of arguments
class Shape
{
	//method overloading
	//zero-arg
	public void area()
	{
		System.out.println("Find area:");
	}
	//one-arg
	public void area(int r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
	//two-arg
	public void area(int l,int b)
	{
		System.out.println("Area of Rectangle:"+(l*b));
	}
	
	
}
public class ExampleOnMethodOverloading {

	public static void main(String[] args) {
		Shape sh=new Shape();
		sh.area();
		sh.area(5);
		sh.area(20, 15);

	}

}
