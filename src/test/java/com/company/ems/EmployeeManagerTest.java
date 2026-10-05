package com.company.ems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
public class EmployeeManagerTest {

    // ---------- BLACK-BOX TESTS ----------

    @Test
    void testAddValidEmployee() {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Employee("E001", "Alice", "HR", 3000));
        assertNotNull(m.getEmployee("E001"));
    }

    @Test
    void testDuplicateIdRejected() {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Employee("E001", "Alice", "HR", 3000));
        assertThrows(IllegalArgumentException.class,
                () -> m.addEmployee(new Employee("E001", "Bob", "IT", 4000)));
    }

    @Test
    void testRemoveEmployee() {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Employee("E001", "Alice", "HR", 3000));
        assertTrue(m.removeEmployee("E001"));
        assertNull(m.getEmployee("E001"));
    }

    // ---------- WHITE-BOX TESTS ----------

    @Test
    void testDuplicateBranchTrue() {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Employee("E001", "Alice", "HR", 3000));
        assertThrows(IllegalArgumentException.class,
                () -> m.addEmployee(new Employee("E001", "X", "Y", 1)));
    }

    @Test
    void testDuplicateBranchFalse() {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Employee("E002", "Bob", "IT", 4000));
        assertEquals(1, m.getAllEmployees().size());
    }
}