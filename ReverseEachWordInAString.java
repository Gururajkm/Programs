package com;

public class ReverseEachWordInAString {
	public static void main(String[] args) {

		// Approach -> 1
		String str = "Welcome to Java";

		String[] words = str.split(" ");

		String reverseString = " ";

		for (String w : words) {
			String reverseword = " ";

			for (int i = w.length() - 1; i > 0; i--) {
				reverseword = reverseword + w.charAt(i);
			}
			reverseString = reverseString + reverseword + " ";
		}
		System.out.println(reverseString);

		System.out.println("--------------------------");

		// Approach -> 2

		String str1 = "Welcome to Java";
		String[] words1 = str1.split("\\s");
		String reverseword1 = " ";
		for (String w1 : words1) {
			StringBuilder sb = new StringBuilder(w1);
			sb.reverse();

			reverseword1 = reverseword1 + sb.toString() + " ";
		}
		System.out.println(reverseword1);
	}

}
