package com.simplilearn.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _05_ImperativeVsDeclarative {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3);

		// Imperative programming (for, if/else, switch case)
		System.out.println("Imperative programming (for, if/else, switch case)");
		for (Integer number : integerList) {
			System.out.print(number + " ");
		}

		// Declarative programming
		System.out.println("\n\nDeclarative programming");
		Consumer<Integer> printNumber = (eachNumber) -> System.out.print(eachNumber + " ");
		integerList.forEach(printNumber);

		System.out.println("\n\nDeclarative programming Improvised");
		integerList.forEach(eachNumber -> System.out.print(eachNumber + " "));

		System.out.println("\n\nDeclarative programming Method Reference");
		// Cosumer's -> accept to -> System.out's print using Method Reference!
		Consumer<Integer> printNumberLinked = System.out::print;
		integerList.forEach(printNumberLinked);
	}

}
