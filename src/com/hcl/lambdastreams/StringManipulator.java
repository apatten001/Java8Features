package com.hcl.lambdastreams;

public interface StringManipulator {

	// by default prints the first char of the string
	default void printFirstChar(String str) {

		System.out.println("This word starts with: " + str.charAt(0));
	};

	
	void count();

	// returns the count of the string length
	static void countString(String str) {

	};

}
