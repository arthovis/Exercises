package com.andrei.exercises.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 20, 115, 40);
        List<Integer> otherNumbers = Arrays.asList(12, 22, 111, 10);


        System.out.println("For Each: ");
        numbers.forEach(s -> System.out.println(s));

        System.out.println("\nFilter: ");
        numbers.stream()
                .filter(s -> s < 100)
                .forEach(System.out::println);

        System.out.println("\nMap:");
        numbers.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        Long count = numbers.stream()
                .collect(Collectors.counting());
        System.out.println("\nSize of the list: " + count);

        Integer sum = numbers.stream()
                .collect(Collectors.summingInt(x -> x.intValue()));
        System.out.println("\nThe sum of the numbers in the list is: " + sum);

        System.out.println("\nCollectors.toList(): ");
        List<Integer> numbersSquare = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(numbersSquare);

        System.out.println("\nFlat Map: ");
        List<Integer> allNumbers = Stream.of(numbers, otherNumbers)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(allNumbers);

        System.out.println("\nReduce: ");
        int result = numbers.stream().reduce(0,(subtotal,element) -> subtotal+element);
        System.out.println(result);




    }
}
