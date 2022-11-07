package org.tnsindia.generics;

public class GenericMethodExample 
{
	public static <E> void printArray (E[] elem)
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
		Integer[] arr1= {10,20,30,40};
		Character [] arr2 ={'z','x','a','g'};
		System.out.println("Printing Array for integer");
		printArray(arr1);
		System.out.println("Printing Aray for Character");
		printArray(arr2);
		
		
	}

}
