package com.simplilearn.basics;

public class _03_MethodReferenceStaticMethod {

	@FunctionalInterface
	interface Printer {
		void print();
	}

	@FunctionalInterface
	interface ArithmeticCalculator {
		int subtract(int a, int b);
	}

	static class TestReferencce {
		// Reference to an Static Method -> Without parameters
		// print -> display -> Method Reference
		static void display() {
			System.out.println("Welcome to the session");
		}

		// Reference to an Static Method -> Without parameters
		// subtract -> difference -> Method Reference
		static int difference(int a, int b) {
			System.out.println("difference method is invoked!");
			return a - b;

		}

		public static void main(String[] args) {
			Printer printerObj = TestReferencce::display;
			printerObj.print();

			ArithmeticCalculator calculator = TestReferencce::difference;
			int result = calculator.subtract(50, 20);
			System.out.println("Result subtract(50, 20) =  " + result);
		}

	}

}
