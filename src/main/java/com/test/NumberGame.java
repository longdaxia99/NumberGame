package com.test;

public class NumberGame {
	public void printNumbers(int from, int to) {
		if (from > to) {
			System.out.println("to number must equal or greater than from number");
			return;
		}
		
		for(int i = from; i <= to; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public void printNumbersWithIn(int from, int to) {
		if (from > to) {
			System.out.println("to number must equal or greater than from number");
			return;
		}
		
		for(int i = from; i <= to; i++) {
			String currentNumber = String.valueOf(i);
			boolean hasThree = currentNumber.indexOf("3") != -1;
			boolean hasFive = currentNumber.indexOf("5") != -1;
					
			if (((i % 3 == 0) && (i % 5 == 0)) || (hasThree && hasFive)) {
				System.out.println("FizzBuzz");
			} else if((i % 3 == 0) || hasThree) {
				System.out.println("Fizz");
			} else if((i % 5 == 0) || hasFive) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
