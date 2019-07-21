package com.andrei.exercises.io.read_write_bufferedreader;

import java.io.*;

public class DemoBufferedReader {
    public static void main(String[] args) throws IOException {
        readWithBufferedReader();

        writeWithBufferedWriter();

        writeWithBufferedAppendedWriter();


    }

    private static void writeWithBufferedAppendedWriter() throws IOException {
        File destination = new File("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\randomstuff.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination,true))){
            String newText = "\nNew Random Appended Text";
            bufferedWriter.write(newText);
        }
    }

    private static void writeWithBufferedWriter() throws IOException {
        File destination = new File("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\randomstuff.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))){
            String line = "New Random Text.";
            bufferedWriter.write(line);
        }
    }

    private static void readWithBufferedReader() throws IOException {
        File destination = new File("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\randomstuff.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(destination))){
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        }
    }
}
