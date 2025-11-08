package com.example.demo;

import com.example.demo.model.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeControllerTest {

    @Test
    void simpleTest() {
        Employee emp = new Employee("John", "Developer");
        assertEquals("John", emp.getName());
    }
}

