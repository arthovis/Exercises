package com.andrei.exercises.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
    }
}
