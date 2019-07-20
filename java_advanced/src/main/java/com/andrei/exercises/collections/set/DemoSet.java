package com.andrei.exercises.collections.set;

import com.andrei.exercises.collections.CollectionsPrinter;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> colours = new HashSet<>();
        colours.add("Black");
        colours.add("White");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Black");

        CollectionsPrinter.printSet(colours);

        System.out.println("\nAfter removal of a colour: ");
        colours.remove("Yellow");
        CollectionsPrinter.printSet(colours);

        sortingTheSet(colours);
    }

    private static void sortingTheSet(Set<String> colours) {
        List<String> sortedSet = new ArrayList<>(colours);
        Collections.sort(sortedSet);
        System.out.println("\nSorted set: ");
        CollectionsPrinter.printList(sortedSet);
    }
}
