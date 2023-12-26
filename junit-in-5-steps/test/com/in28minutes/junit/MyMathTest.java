package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		
		int[] numbers = {1,2,3};
		MyMath math = new MyMath();
		int result = math.calculateSum(numbers);
		System.out.println(result);
		int expectedResult = 6;
		assertEquals(expectedResult, result);
	}

}
