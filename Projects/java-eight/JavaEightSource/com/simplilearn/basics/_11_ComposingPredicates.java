package com.simplilearn.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _11_ComposingPredicates {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "Grapes", "Pomogranate");

		// 1.It has len > 5
		Predicate<String> isLengthGrt5 = str -> str.length() > 5;

		// 2. The fruit contains 'O' character
		Predicate<String> containsO = str -> str.toLowerCase().indexOf('o') != -1;

		// Composing Predicates!
		Predicate<String> isLengthGrt5AndContainsO = isLengthGrt5.and(containsO);
		
		for(String eachFruit : fruits) {
			System.out.println("isLengthGrt5AndContainsO : "+eachFruit+" ? "+ isLengthGrt5AndContainsO.test(eachFruit));
		}

	}

}
