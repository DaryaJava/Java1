package com.geekbrains;

public class Lesson5 {
    public static void main(String[] arg) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Tikhomirova Darya", "QA Engineer", "darya@geekbrains.ru", "8-921-111-11-11", 100000, 30);
        employees[1] = new Employee("Tikhomirova Vladimir", "Java Developer", "vladimir@geekbrains.ru", "8-921-222-22-22", 150000, 41);
        employees[2] = new Employee("Tikhomirova Kylie", "QA Engineer", "kylie@geekbrains.ru", "8-921-333-33-33", 100000, 39);
        employees[3] = new Employee("Efremova Tatiana", "QA Engineer", "tatiana@geekbrains.ru", "8-921-444-44-44", 80000, 50);
        employees[4] = new Employee("Tikhomirova Julia", "Junior Java Developer", "julia@geekbrains.ru", "8-921-555-55-55", 50000, 20);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printToConsole();
            }
        }
    }
}
