package com;

public class FactorialOfANumber {
	public static void main(String[] args) {

		int num = 5;
		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i; //1 2 6 24 120
		}

		System.out.println("Factorial of a Number: " + factorial);

	}

}
