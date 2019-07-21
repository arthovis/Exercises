package com.andrei.exercises.concurrency.callable;

import java.util.concurrent.*;

public class DemoCallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String > callable = () -> {
            System.out.println("Entering the callable dimension");
            Thread.sleep(1000);
            return "Hello from the callable dimension";
        };
        System.out.println("Submitting callable");
        Future<String> future = executorService.submit(callable);

        String result = future.get();
        System.out.println(result);
    }
}
