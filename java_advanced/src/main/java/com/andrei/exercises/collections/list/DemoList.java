package com.andrei.exercises.collections.list;

import com.andrei.exercises.collections.CollectionsPrinter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Dacia");
        cars.add("Mercedes");
        cars.add("Lamborghini");
        cars.add("Bentley");
        cars.add("Aston Martin");

        CollectionsPrinter.printList(cars);
        printWithIterator(cars);

        printSecondObjectInList(cars);

        System.out.println("Index of Bentley: "+cars.indexOf("Bentley"));

        addingCarToList(cars);

        removingCar(cars);

        System.out.println("\nNumber of Cars: "+cars.size());

        printCountryOfOriginOfACarInList(cars);

        printMessageIfArrayIsNotEmpty(cars);


    }

    private static void printMessageIfArrayIsNotEmpty(List<String> cars) {
        if (!cars.isEmpty()){
            System.out.println("The garage is not empty. It has "+cars.size()+" cars in it.");
        }
    }

    private static void printCountryOfOriginOfACarInList(List<String> cars) {
        if (cars.contains("Mercedes")){
            System.out.println("\nCountry of origin: Germany");
        }
    }

    private static void addingCarToList(List<String> cars) {
        cars.add(0,"BMW");
        CollectionsPrinter.printList(cars);
        System.out.println();
    }

    private static void printSecondObjectInList(List<String> cars) {
        System.out.println();
        String secondCarInList = cars.get(1);
        System.out.println(secondCarInList);
    }

    private static void removingCar(List<String> cars) {
        System.out.println("Before removing a car:");
        CollectionsPrinter.printList(cars);
        System.out.println();

        cars.remove("Dacia");
        System.out.println("After removing a car: ");
        CollectionsPrinter.printList(cars);
    }

    private static void printWithIterator(List<String> cars) {
        Iterator<String> iterator = cars.iterator();

        while (iterator.hasNext()) {
            String nextCar = iterator.next();
            System.out.println(nextCar + " " + nextCar.toUpperCase());
        }
    }
}
