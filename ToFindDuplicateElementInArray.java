package com;

public class ToFindDuplicateElementInArray {
	public static void main(String[] args) {

		String arr[] = { "java", "C", "C++", "Python", "java" };

		// Logic 1
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate Element is " + arr[i]);
					flag = true;
				}
			}
		}

		if (flag == false) {
			System.out.println("Duplicate Element Not Found");
		}
	}

}
