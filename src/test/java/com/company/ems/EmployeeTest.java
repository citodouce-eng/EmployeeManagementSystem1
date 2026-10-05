package com.company.ems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void testNegativeSalaryBranchTrue() {
        assertThrows(IllegalArgumentException.class,
                () -> new Employee("E001", "A", "HR", -1));
    }

    @Test
    void testSalaryZeroBranchFalse() {
        Employee e = new Employee("E001", "A", "HR", 0);
        assertEquals(0, e.getSalary());
    }
}