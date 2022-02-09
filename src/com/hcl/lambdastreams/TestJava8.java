package com.hcl.lambdastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class TestJava8 implements Arithmic{
	
	// implement abstract method
	public int add(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "Computer";
		String word2 = "Ledger";
		String word3 = "Mouse";
		String word4 = "Keyboard";
		String word5 = "Book";
		
		
		List<String> wordList = new ArrayList<>(); 
		
		
		wordList.add(word1);
		wordList.add(word2);
		wordList.add(word3);
		wordList.add(word4);
		wordList.add(word5);
		
		
		// Use the for each with a Lambda Expression
		wordList.forEach((var) -> System.out.println(var));
		
		
	    // Returns a reference string from the method reference me 
		StringManipulator strMan = ReferenceMethod::referenceMe;
		
		strMan.count();
		
		TestJava8 test = new TestJava8();
		
		test.add(6,5);
		
		 BiFunction<Integer, Integer, Integer> adder = test::add; 
		 int j = adder.apply(21, 11);
		
		 System.out.println(j);
		
		
		
		
	}

}
