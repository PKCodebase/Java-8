package com.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployee{

    public static void main(String[] args) {

        List<Employee> myemp = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 60000),
                new Employee("Bob", 55000),
                new Employee("Eve", 45000)
        );

//        List<Employee> sortedEmployees = myemp.stream()
//                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
//                .toList();
//
//        sortedEmployees.forEach(System.out::println);


//        List<Employee> sortedEmployee = myemp.stream()
//                .sorted((e1,e2)->e1.getName().compareTo (e2.getName()))
//                .toList();
//
//        sortedEmployee.forEach(System.out::println);

        List<Employee> sortedEmployee = myemp.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();

        sortedEmployee.forEach(System.out::println);


    }
}
