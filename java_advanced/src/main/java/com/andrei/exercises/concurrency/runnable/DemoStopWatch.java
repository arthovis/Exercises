package com.andrei.exercises.concurrency.runnable;

public class DemoStopWatch {
    public static void main(String[] args) {
        Thread stopWatchThread = new Thread(new StopWatchThread());
        stopWatchThread.start();
    }
}
