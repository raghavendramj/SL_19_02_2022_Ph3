package com.simplilearn.basics;

import java.util.function.Predicate;

public class _10_Predicates {
	
	public static void main(String[] args) {
		
		//Takes any input -> Boolean 
		Predicate<String> isLongerThan5 = str -> str.length() > 5;
		System.out.println(isLongerThan5.test("Raghav"));
		System.out.println(isLongerThan5.test("sam"));
	}
}
