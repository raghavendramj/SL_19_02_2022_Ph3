package com.simpllearn.basics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


//@TestMethodOrder(MethodOrderer.MethodName.class) -> Methods in sequence
@TestMethodOrder(OrderAnnotation.class) // -> Orders in sequence
public class AlphanumericOrderUnitTest {
    private static StringBuilder output = new StringBuilder("");

    @Test
    @Order(3)
    void first(){
        output.append("A");
    }
    @Test
    @Order(1)
    void second(){
        output.append("B");
    }
    @Test
    @Order(2)
    void third(){
        output.append("C");
    }

    @AfterAll
    static void assertOutput(){
        Assertions.assertEquals(output.toString(), "BCA");
    }
}
