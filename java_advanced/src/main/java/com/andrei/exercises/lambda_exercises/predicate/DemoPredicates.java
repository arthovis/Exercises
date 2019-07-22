package com.andrei.exercises.lambda_exercises.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        namesWithA.forEach(System.out::println);

        Predicate<Integer> numbersLessThan2Predicate = number -> number < 2;

        List<Integer> numbers = Arrays.asList(1, 2);
        numbers.stream()
                .filter(numbersLessThan2Predicate)
                .filter(number -> number < 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
