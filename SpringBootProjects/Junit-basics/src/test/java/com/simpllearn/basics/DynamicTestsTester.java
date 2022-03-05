package com.simpllearn.basics;

import com.simpllearn.basics.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;



public class DynamicTestsTester {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach -> Invoked");
        calculator = new Calculator();
    }


    @TestFactory
    Stream<DynamicTest> testDifferentMultiplyOperations() {
        int data[][] = new int[][]{
                {1, 2, 2},
                {5, 3, 15},
                {121, 4, 484}
        };

        return Arrays.stream(data).map(
                entry -> {
                    int m1 = entry[0];
                    int m2 = entry[1];
                    int expected = entry[2];
                    return DynamicTest.dynamicTest(
                            m1 + " * " + m2 + " = " + expected,
                            () -> Assertions.assertEquals(expected, calculator.multiply(m1, m2))
                    );
                });
    }
}
