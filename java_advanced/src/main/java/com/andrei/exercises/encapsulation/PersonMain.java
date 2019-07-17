package com.andrei.exercises.encapsulation;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(25);
        person.setFirstName("Andrei");
        person.setLastName("Baicu");

        System.out.println("First name: "+person.getFirstName());
        System.out.println("Last name: "+person.getLastName());
        System.out.println("Age: "+person.getAge()+" years old.");
    }
}
