package com.company.ems;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee("E001", "Alice", "HR", 3000));
        manager.addEmployee(new Employee("E002", "Bob", "IT", 4500));

        ReportGenerator rg = new ReportGenerator();
        System.out.println(rg.generateEmployeeReport(manager.getAllEmployees()));
    }
}