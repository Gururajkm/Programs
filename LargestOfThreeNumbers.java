package com;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a = sc.nextInt();

		System.out.println("Enter Second number: ");
		int b = sc.nextInt();

		System.out.println("Enter Third number: ");
		int c = sc.nextInt();

		// Logic-1
		if (a > b && a > c) {
			System.out.println(a + " is largest Number");
		} else if (b > a && b > c) {
			System.out.println(b + " is  largest Number");
		} else {
			System.out.println(c + " is largest Number");
		}
	}

}
