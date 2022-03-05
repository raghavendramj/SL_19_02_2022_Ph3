package com.simplilearn.basics;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class _07_Supplier {

	public static void main(String[] args) {

		// Supplier does'nt take any params, but returns the output
		Supplier<Double> getRandomNumber = () -> Math.random() * 1000;
		Double randomeValue = getRandomNumber.get(); // Lazy Evaluation!
		System.out.println("Random Value " + randomeValue);

		DoubleSupplier getRandomNumberDS = () -> Math.random() * 1000;
		System.out.println("DoubleSupplier Value " + getRandomNumberDS.getAsDouble());
	}
}
