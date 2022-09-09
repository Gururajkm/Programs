package com;

public class ReverseString {
	public static void main(String[] args) {

		String str = "ABCD";
		String rev = " ";

		// Logic 1 - using +(String Concatenation) Operator
		int len = str.length(); //4
		for (int i = len - 1; i >= 0; i--) // 3 2 1 0 -1
		{
			rev = rev + str.charAt(i); //DCBA
			System.out.println("Reversed String: " + rev);
		}
		System.out.println("-----------------------");
		System.out.println("Reversed String: " + rev);
	}

}
