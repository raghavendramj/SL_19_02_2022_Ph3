package com.simplilearn.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class _09_CompisingFunctions {

	public static void main(String[] args) {
		// List of names -> virat, rishabh, jadeja
		// 1. Capitalize the name -> Input -> String O/P -> String -> Virat
		Function<String, String> capitalizeString = input -> input.substring(0, 1).toUpperCase() + input.substring(1);

		// 2. "5:Virat" -> Input -> String O/P -> String -> {5:Virat}
		Function<String, String> mappedStrings = input -> "{" + input.length() + ":" + input+"}";

		List<String> names = Arrays.asList("virat", "rishabh", "jadeja");
		String output = capitalizeString.andThen(mappedStrings).apply("virat");
		System.out.println("output : " + output);
		
		for(String eachName : names) {
			System.out.println(capitalizeString.andThen(mappedStrings).apply(eachName));
		}
	}
}
