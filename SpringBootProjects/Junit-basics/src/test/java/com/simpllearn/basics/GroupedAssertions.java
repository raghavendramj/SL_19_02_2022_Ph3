package com.simpllearn.basics;

import com.simpllearn.basics.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GroupedAssertions {

    @Test
    void groupedAssertions() {
        Employee employee = new Employee("John", "Doe", "Bangalore");
        assertAll("employee name",
                () -> assertEquals("John", employee.getFirstName()),
                () -> assertEquals("Doe", employee.getLastName()),
                () -> assertEquals("Bangalore", employee.getAddress())

        );
    }
}
