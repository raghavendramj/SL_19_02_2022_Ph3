package com.simplilearn.basics;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class _12_BinaryOperartor {

	public static void main(String[] args) {
		BinaryOperator<Integer> addition = (a, b) -> a + b;
		int result = addition.apply(12, 23);
		System.out.println("addition result  :- " + result);

		Function<Integer, Integer> square = a -> a * a;
		int squaredNumber = square.apply(4);
		System.out.println("squaredNumber :- " + squaredNumber);

		// Combination of BinaryOperator + Function => BiFunction
		BiFunction<Integer, Integer, Integer> addAndSquare = addition.andThen(square);
		System.out.println("addAndSquare : " + addAndSquare.apply(5, 4));

	}

}
