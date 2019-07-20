package com.andrei.exercises.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class DemoTryWithResources {
    public static void main(String[] args) throws IOException {
        tryRead();
    }

    private static void tryRead() throws IOException {
        try (FileInputStream input = new FileInputStream("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\randomstuff.txt")) {
            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        }
    }
}