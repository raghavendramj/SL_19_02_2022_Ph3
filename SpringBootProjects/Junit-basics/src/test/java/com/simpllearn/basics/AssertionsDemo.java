package com.simpllearn.basics;

import com.simpllearn.basics.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsDemo {

    @Test
    @DisplayName("Simple assertEqualsTest")
    void assertEqualsTest(){
        int a = 10;
        int b = 20;
        int result = a + b;
        assertEquals(310, result, "Equality failed");
    }
    @Test
    @DisplayName("Simple assertTrueTest")
    void assertTrueTest(){
        int a = 10;
        int b = 20;
        assertTrue(a < b);
        //assertTrue(a > b); //Failure case
    }
    @Test
    @DisplayName("Simple assertNullTest")
    void assertNullTest(){
        Calculator calculator = null;
        assertNull(calculator);
    }
}
