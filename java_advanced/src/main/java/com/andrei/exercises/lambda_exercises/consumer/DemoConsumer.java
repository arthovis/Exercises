package com.andrei.exercises.lambda_exercises.consumer;

import java.util.Arrays;
import java.util.List;

public class DemoConsumer {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrei", "Ion", "Gigel");
        names.forEach(name -> computeStuff(name));

        names.forEach(name -> System.out.println("Neata " + name));

    }

    private static void computeStuff(String name) {
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

    }
}
