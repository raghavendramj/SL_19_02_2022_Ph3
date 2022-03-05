package com.simpllearn.basics;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach -> Invoked");
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work - Normal Case")
    void testMulitply() {
        assertEquals(20, calculator.multiply(5, 4), "Regular Multiplication should work");
    }

    @Test
    @DisplayName("Simple multiplication should work - Zero Case")
    void testMulitplyWithZero() {
        assertEquals(0, calculator.multiply(5, 0), "Multiply with 0 should be 0");
        assertEquals(0, calculator.multiply(0, 6), "Multiply with 0 should be 0");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero ")
    void testMultiplyWithZero() {
        System.out.println("Execution test -> five times" + System.getProperty("os.name"));
        Assumptions.assumeFalse(System.getProperty("os.name").contains("linux"));
        Assumptions.assumeTrue(System.getProperty("os.name").contains("Windows 10"));
        assertEquals(0, calculator.multiply(0, 5), "Multiply with zero should be zero");
        assertEquals(0, calculator.multiply(12, 0), "Multiply with zero should be zero");
    }

}
