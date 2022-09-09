package com;

public class SwappingTwoNumbers {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("Before Swapping " + a + " " + b);

		// Logic 1 -> Third Value
		int t = a;
		a = b;
		b = t;
		System.out.println("After  Swapping " + a + " " + b);

		/*
		// Logic 2 -> Use + and = without using Third variable
		a = a + b; //10+20=30
		b = a - b; //30-20=10
		a = a - b; //30-10=20
		System.out.println("After  Swapping " + a + " " + b);
		*/

		/*
		// Logic 3 -> Use * and / without using Third variable
		// Note: here a and b values should not be zero
		a = a + b; //10*20=200
		b = a - b; //200/20=10
		a = a - b; //200/10=20
		System.out.println("After  Swapping " + a + " " + b);
		*/
		
		/*
		// Logic 4 -> Bitwise Operator XOR(^)
		a = a ^ b; //10^20=30
		b = a ^ b; //30^20=10
		a = a ^ b; //30^10=20
		System.out.println("After  Swapping " + a + " " + b);
		*/
		
		/*
		// Logic 5 -> Single Statement a=10 b=20
		b= a+b-(a=b);
		System.out.println("After  Swapping " + a + " " + b);
		*/

	}
}
