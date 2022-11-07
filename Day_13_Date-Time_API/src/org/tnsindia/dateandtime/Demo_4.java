package org.tnsindia.dateandtime;

import java.time.Clock;

public class Demo_4 {

	public static void main(String[] args) 
	{
		Clock c=Clock.systemUTC();
		Clock c1=Clock.systemDefaultZone();
		System.out.println("Time Zone = "+c1);
		System.out.println("Time Zone = "+c);
	
	}

}
