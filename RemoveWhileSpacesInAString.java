package com;

public class RemoveWhileSpacesInAString {
	public static void main(String[] args) {

		String str = "Java Programming Selenium Automation";
		System.out.println("Before removing the while spaces: " + str);

		str = str.replaceAll("\\s", "");
		System.out.println("After  removing the while spaces: " + str);
	}

}
