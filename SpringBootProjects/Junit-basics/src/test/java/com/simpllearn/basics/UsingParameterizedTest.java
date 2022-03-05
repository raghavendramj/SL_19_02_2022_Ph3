package com.simpllearn.basics;

import com.simpllearn.basics.Calculator;
import com.simpllearn.basics.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UsingParameterizedTest {
    Calculator calculator;

    public static int[][] data() {
        return new int[][]{{1, 2, 2}, {5, 3, 15}, {121, 4, 484}};
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach -> Invoked");
        calculator = new Calculator();
    }

    @ParameterizedTest
    @MethodSource(value = "data")
    void testWithStringParameter(int[] data) {
        int m1 = data[0];
        int m2 = data[1];
        int expected = data[2];
        Assertions.assertEquals(expected, calculator.multiply(m1, m2));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 3})
    void testValueSource(int number) {
        Assertions.assertTrue(Numbers.isOdd(number), "This is even number");
    }

}
