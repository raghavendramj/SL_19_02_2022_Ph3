package com.simplilearn.basics;

@FunctionalInterface
interface Adder {
	int add(int a, int b);
}

public class _01_AnonymousClass {

	public static void main(String[] args) {
		Adder adder = new Adder() {
			public int add(int a, int b) {
				return a + b;
			}
		};

		int sum = adder.add(10, 20);
		System.out.println("Result : " + sum);

		// Lamda Expression
		Adder adderUsingLamda = (a, b) -> {
			return a + b;
		};

		System.out.println("Using Lamda Result : " + adderUsingLamda.add(10, 20));

		// Lamda Expression Simplified
		Adder adderUsingLamdaSimplified = (a, b) -> a + b;
		System.out.println("Using Lamda Result Simplified : " + adderUsingLamdaSimplified.add(10, 20));
	};
}
