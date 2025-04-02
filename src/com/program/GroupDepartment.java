package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupDepartment {
    String name;
    String department;

    public GroupDepartment(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public static void main(String[] args) {
        List<GroupDepartment> groupDepartments = Arrays.asList(
                new GroupDepartment("John", "IT"),
                new GroupDepartment("Alice", "HR"),
                new GroupDepartment("Bob", "IT"),
                new GroupDepartment("Eve", "HR")
        );

        // Group employees by department
        Map<String, List<GroupDepartment>> group = groupDepartments.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));

        // Print the grouped employees
        group.forEach((dept, emps) -> {
            System.out.println(dept + ": " +
                    emps.stream().map(e -> e.name).collect(Collectors.toList()));
        });
    }
}