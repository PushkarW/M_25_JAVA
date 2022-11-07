package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestCaseDemo {

	@DisplayName("Parameterized")
	@ParameterizedTest
	@ValueSource (ints= {12,35,25,9})
	
	void display (int arg)
	{
		assertTrue(arg>15);
	
	}
	
}
