package com.andrei.exercises.map.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class DemoPerson {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Andrei"));
        personList.add(new Person("Mircea"));
        personList.add(new Person("Alex"));
        personList.add(new Person("Bogdan"));
        personList.add(new Person("Florin"));
        personList.add(new Person("Cristi"));
        personList.add(new Person("Daniel"));

        printUnsortedNames(personList, "Names before sorting: ");
        sortAndPrintNames(personList);

    }

    private static void sortAndPrintNames(ArrayList<Person> personList) {
        Collections.sort(personList);

        printUnsortedNames(personList, "\nNames after sorting: ");
    }

    private static void printUnsortedNames(ArrayList<Person> personList, String s) {
        System.out.println(s);

        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}
