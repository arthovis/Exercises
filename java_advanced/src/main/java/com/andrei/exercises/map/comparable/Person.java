package com.andrei.exercises.map.comparable;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }


}
