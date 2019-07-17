package com.andrei.exercises.inheritance.overloading;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        PartTimeEmployee employee2 = new PartTimeEmployee();

        employee1.setName("Andrei Baicu");
        employee1.setId(1990);

        employee1.display();

        System.out.println();

        employee2.setName("Ionica Viteazu");
        employee2.setId(6969);

        employee2.setHrsWorked(4.5);
        employee2.setHourlyRate(45.5);

        employee2.display();
        employee2.display("Information on part-time employee:");
    }
}
