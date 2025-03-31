package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeSalaryFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        // Input number of employees
        System.out.print("Enter number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input employee details
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employees.add(new Employee(name, salary));
        }

        // Input salary range for filtering
        System.out.print("Enter minimum salary for filtering: ");
        double minSalary = scanner.nextDouble();

        System.out.print("Enter maximum salary for filtering: ");
        double maxSalary = scanner.nextDouble();

        // Filter employees based on salary range using streams
        List<Employee> filteredEmployees = employees.stream()
            .filter(emp -> emp.getSalary() >= minSalary && emp.getSalary() <= maxSalary)
            .collect(Collectors.toList());

        // Output the filtered employees
        System.out.println("\nEmployees with salary between " + minSalary + " and " + maxSalary + ":");
        filteredEmployees.forEach(System.out::println);

        scanner.close();
    }
}