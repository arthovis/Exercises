package com.andrei.exercises.lambda_exercises.consumer;

import java.util.HashMap;
import java.util.Map;

public class DemoBiConsumer {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Andrei", 25);
        ages.put("Ion", 24);
        ages.put("Gigel", 30);

        ages.forEach((name, age) -> System.out.println(name + " is "
                + age + " years old"));
    }
}
