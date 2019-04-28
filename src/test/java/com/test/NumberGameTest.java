package com.test;

import static org.hamcrest.CoreMatchers.nullValue;

import org.junit.Before;
import org.junit.Test;

public class NumberGameTest {
	NumberGame numberGame = null;
	
	@Before
	public void init() {
		numberGame = new NumberGame();
	}
	
	@Test
	public void testPrintNumbers() {
		numberGame.printNumbers(1, 100);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>> end of testPrintNumbers");
	}
	
	@Test
	public void testPrintNumbersWithIn() {
		numberGame.printNumbersWithIn(1, 100);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>> end of testprintNumbersWithIn");
	}
}
