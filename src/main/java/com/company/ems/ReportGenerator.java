package com.company.ems;

import java.util.List;

public class ReportGenerator {

    public String generateEmployeeReport(List<Employee> employees) {
        StringBuilder sb = new StringBuilder("Employee Report\n");
        for (Employee e : employees) {
            sb.append(e.getId()).append(" - ")
                    .append(e.getName()).append(" - ")
                    .append(e.getDepartment()).append(" - ")
                    .append(e.getSalary()).append("\n");
        }
        return sb.toString();
    }
}