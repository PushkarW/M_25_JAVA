package org.tnsindia.junit5demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display() 
	{
		System.setProperty("Pushkar","wanjari");
		Assumptions.assumeTrue("Wanj".equals(System.getProperty("Pushkar")));
	}
	@Test
	void display1() 
	{
		System.setProperty("Pushkar","wanjari");
		Assumptions.assumeFalse("wanjari".equals(System.getProperty("Pushkar")));
	}

}
