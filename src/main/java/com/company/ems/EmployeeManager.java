package com.company.ems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {
    private Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(Employee emp) {
        if (employees.containsKey(emp.getId())) {
            throw new IllegalArgumentException("Employee ID already exists");
        }
        employees.put(emp.getId(), emp);
    }

    public Employee getEmployee(String id) {
        return employees.get(id);
    }

    public boolean removeEmployee(String id) {
        return employees.remove(id) != null;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }
}