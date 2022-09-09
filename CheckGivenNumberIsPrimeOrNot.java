package com;

public class CheckGivenNumberIsPrimeOrNot {
	public static void main(String[] args) {

		// Natural Number ->1
		// Which has only 2 factors 1 and itself

		// 10 -> 1 and 19 -> PrimeNumber
		// 28 -> 1,2,4,7,14,28 ->Not a PrimeNumber

		int num = 3;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");
			}
		} else {
			System.out.println("Not Prime Number");
		}
	}

}
