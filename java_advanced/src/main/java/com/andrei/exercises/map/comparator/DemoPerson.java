package com.andrei.exercises.map.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class DemoPerson {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Andrei", 29));
        people.add(new Person("Mihai", 3));
        people.add(new Person("Ana", 15));
        people.add(new Person("Ion", 2));
        people.add(new Person("Vasile", 25));
        people.add(new Person("Gigel", 10));

        printUnsortedList(people, "List of people before sorting by age: ");

        sortByAgeAndPrint(people);
    }

    private static void sortByAgeAndPrint(ArrayList<Person> people) {
        ComparingPeople comparingPeople = new ComparingPeople();
        Collections.sort(people,comparingPeople);
        printUnsortedList(people, "\nList of People after sorting by age: ");
    }

    private static void printUnsortedList(ArrayList<Person> people, String s) {
        System.out.println(s);
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
