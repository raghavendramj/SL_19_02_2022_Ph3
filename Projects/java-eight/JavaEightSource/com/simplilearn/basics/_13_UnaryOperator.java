package com.simplilearn.basics;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class _13_UnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<Integer> square = n -> n * n;
		UnaryOperator<Integer> increment = n -> n + n;

		//Combination of 2 unary functions
		Function<Integer, Integer> squareAndIncrement = square.andThen(increment);
		System.out.println("squareAndIncrement : "+ squareAndIncrement.apply(5));
	}

}
