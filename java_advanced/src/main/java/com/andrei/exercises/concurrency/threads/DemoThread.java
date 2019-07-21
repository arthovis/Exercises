package com.andrei.exercises.concurrency.threads;

public class DemoThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();

        myThread.start();

        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.stopRunning();

    }
}
