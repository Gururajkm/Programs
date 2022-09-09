package com;

public class CountNumberOfEvenAndOddNumber {
	public static void main(String[] args) {

		int num = 12345;

		int ec = 0; // ec=even_count
		int oc = 0; // oc=odd_count

		while (num > 0) {
			int rem = num % 10;

			if (rem % 2 == 0) {
				ec++;
			} else {
				oc++;
			}

			num = num / 10;
		}
		System.out.println("Number of Even numbers: " + ec);
		System.out.println("Number of Odd numbers: " + oc);
	}

}
