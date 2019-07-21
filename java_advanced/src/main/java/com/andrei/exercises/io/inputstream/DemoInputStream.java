package com.andrei.exercises.io.inputstream;

import java.io.*;

public class DemoInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeInputStream();

        readInputStream();
    }

    private static void readInputStream() throws IOException, ClassNotFoundException {
        File source = new File("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\cars.txt");
        Car car;

        try (FileInputStream fileInputStream = new FileInputStream(source)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            car = (Car) objectInputStream.readObject();
            System.out.println(car);
        }
    }

    private static void writeInputStream() throws IOException {
        Car car = new Car("Aston Martin", 420);
        File file = new File("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\cars.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(car);
        }

    }
}
