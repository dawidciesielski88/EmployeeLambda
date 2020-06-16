package com.dawidciesielski;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

//        new Thread (()-> System.out.println("Print from Runnable")).start();

        Employee joe = new Employee("Joe Doe", 30);
        Employee david = new Employee("David Dibbs", 31);
        Employee joanna = new Employee("Joanna Seet", 24);
        Employee frank = new Employee("Frank Lin", 45);

        List<Employee> employees = new ArrayList<>();
        employees.add(joe);
        employees.add(david);
        employees.add(joanna);
        employees.add(frank);

        printEmployeeBysByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeeBysByAge(employees, "\nEmployees under 30", employee -> employee.getAge() < 30);
    }

    private static void printEmployeeBysByAge (List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println("============================");
        for (Employee employee: employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
