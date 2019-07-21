package com.andrei.exercises.concurrency.threads;

public class MyThread extends Thread {
    private volatile boolean flag = true;

    public void stopRunning() {
        flag = false;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println("My thread is running!!!!");
        }
        System.out.println("My thread stopped running :(");
    }
}
