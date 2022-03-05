package com.simpllearn.basics;

import com.simpllearn.basics.BackEndService;
import com.simpllearn.basics.HttpRequestCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeOutTest {

    BackEndService service;

    @BeforeEach
    void setUp() {
        service = new BackEndService();
    }

    @Test
    void timeOutNotExceeded() {
        Assertions.assertTimeout(Duration.ofSeconds(4), () -> service.doBackUp());
    }

    @Test
    void timeoutNotExceededWithResult() {
        Assertions.assertTimeout(Duration.ofSeconds(1),
                () -> service.request(new HttpRequestCustom())
        );

        Assertions.assertEquals(200, service.requestObject.getStatus());
        Assertions.assertEquals("Welcome to Junit5", service.requestObject.getMessage());
    }
}
