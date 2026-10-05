package com.company.ems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

    @Test
    void testNegativeHoursBranchTrue() {
        PaymentProcessor p = new PaymentProcessor();
        Employee e = new Employee("E001", "A", "HR", 3000);
        assertThrows(IllegalArgumentException.class,
                () -> p.calculatePayment(e, -5));
    }

    @Test
    void testValidHoursBranchFalse() {
        PaymentProcessor p = new PaymentProcessor();
        Employee e = new Employee("E001", "A", "HR", 3000);
        assertEquals(3000, p.calculatePayment(e, 40));
    }
}