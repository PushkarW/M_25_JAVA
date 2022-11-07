package org.tnsindia.lambdaexpdemo;

public interface MaxFinderDemo {
	
	int max(int a,int b);
	
}
/*we have implemented functional interface by using child class
but here the length of the code is increased,
so we have another way that is lamda expression*/

/*class MaxFinderChildDemo implements MaxFinderDemo
{
	@Override
	public void max(int a, int b) {
		int result=(a>b)?a:b;
		System.out.println("The maximum number is:" +result);
		
	}
	
}*/