package org.tnsindia.generics;

public class GenericsClassExample<T>
{
	T num;
	//Method
	public void show()
	{
		System.out.println(num.getClass().getName());
		
	}

	public static void main(String[] args) {
		GenericsClassExample<Double>obj=new GenericsClassExample<>();
		obj.num=13.55;
		obj.show();
	}

}
