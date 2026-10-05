package com.company.ems;

public class PaymentProcessor {

    public double calculatePayment(Employee emp, double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        return emp.getSalary();
    }
}