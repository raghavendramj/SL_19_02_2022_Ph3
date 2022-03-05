package com.simplilearn.basics;

@FunctionalInterface
interface Printer {
	void print();
}

@FunctionalInterface
interface ArithmeticCalculator {
	int subtract(int a, int b);
}

public class _02_MethodReferenceInstanceMethod {

	// Reference to an Instance Method -> Without parameters
	// print -> display -> Method Reference
	public void display() {
		System.out.println("Welcome to the session");
	}

	// Reference to an Instance Method -> Without parameters
	// subtract -> difference -> Method Reference
	public int difference(int a, int b) {
		System.out.println("difference method is invoked!");
		return a - b;

	}

	public static void main(String[] args) {
		Printer printerObj = new _02_MethodReferenceInstanceMethod()::display;
		printerObj.print();

		ArithmeticCalculator calculator = new _02_MethodReferenceInstanceMethod()::difference;
		int result = calculator.subtract(50, 20);
		System.out.println("Result subtract(50, 20) =  " + result);
	}
}
