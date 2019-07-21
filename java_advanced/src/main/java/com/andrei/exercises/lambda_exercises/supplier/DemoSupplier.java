package com.andrei.exercises.lambda_exercises.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String[] args) {
        getSquaredLazy();
        generateRandomNumber();
    }

    private static void generateRandomNumber() {
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        int randomNumber = randomNumberSupplier.get();
        System.out.println(randomNumber);
    }

    private static void getSquaredLazy() {
        Supplier<Double> lazyValue = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 9d;
        };
        Double valueSquared = squareLazy(lazyValue);
        System.out.println(valueSquared);
    }

    private static Double squareLazy(Supplier<Double> lazyValue) {
        return Math.pow(lazyValue.get(), 2);
    }
}
