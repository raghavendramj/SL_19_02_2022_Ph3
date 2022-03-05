package com.simpllearn.basics;

import com.simpllearn.basics.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTestCase {

    @Test
    void exceptionTesting(){
        User user = new User();
        //assertThrows(IllegalArgumentException.class, () -> user.setAge(23)); //Positively failure use case
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> user.setAge("23"));
        assertEquals("Age must be an integer", exception.getMessage());
    }
}
