package com;

public class ToCountOccurrenceOfaCharacterInAString {
	public static void main(String[] args) {
		String s = "Java Programming Java OOPS";

		int totalcount = s.length();

		int totalcount_afterRemove = s.replace("J", "").length();
		int count = totalcount - totalcount_afterRemove;
		System.out.println("Number Occurances of J is: " + count);

	}

}
