package com;

public class MaximumAndMinimumValuesInArray {
	public static void main(String[] args) {
		
		// Maximum Number
		int a[] = { 50, 100, 40, 20, 60 };

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Element is Array: " + max);

		System.out.println("---------------------------------");
		
		// Minimum Number
		int a1[] = { 50, 100, 40, 20, 60 };

		int min = a[0];
		for (int i = 1; i < a1.length; i++) {
			if (a1[i] < min) {
				min = a1[i];
			}
		}
		System.out.println("Minimum Element is Array: " + min);

	}

}
