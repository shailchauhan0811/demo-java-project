package com.example.demo;

import com.example.demo.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeControllerTest {

    @Test
    void simpleTest() {
        Employee emp = new Employee("John", "Developer");
        assertEquals("John", emp.getName());
    }
}

