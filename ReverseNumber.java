package com;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");

		int num = sc.nextInt();// 1234

		// Logic 1 - Using Algorithm
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
			System.out.println("Reverse Number: " + rev);
			// 0+1234%10=4  40+3=43    430+2=432  4320+1=4321
			// 1234/10=123  123/10=12  12/10=1    1/10=0
		}
		System.out.println("----------------------");
		System.out.println("Reverse Number: " + rev);
	}

}
