package com.simplilearn.basics;

interface ICalculator {
	int add(int a, int b);
	int subtract(int a, int b);
}

public class Calculator implements ICalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
}
