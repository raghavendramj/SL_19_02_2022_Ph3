package com.simplilearn.basics;

import java.util.function.Function;

public class _08_FunctionInterface {

	public static void main(String[] args) {
		Function<String, Integer> findLendgth = str -> str.length();
		Integer nameLength = findLendgth.apply("Raghavendra");
		System.out.println("Length is "+nameLength);
	}
}
