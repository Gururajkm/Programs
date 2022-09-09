package com;

import java.util.Arrays;

public class SortingElementsInArrayUsingBuilgInMethods {
	public static void main(String[] args) {

		// Approach 1
		int a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Array Elements Before Sorting: " + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array Elements After  Sorting: " + Arrays.toString(a));

		System.out.println("---------------------------------------------");

		// Approach 2
		int a1[] = { 30, 50, 20, 10, 60 };
		System.out.println("Array Elements Before Sorting: " + Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("Array Elements After  Sorting: " + Arrays.toString(a1));
	}
	

}
