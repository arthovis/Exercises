package com.andrei.exercises.io.read_write_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class DemoReadWriteFiles {
    public static void main(String[] args) throws IOException {
        write();
        read();


    }

    private static void read() throws IOException {
        Path source = Paths.get("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\newrandomfile.txt");
        List<String> lines = Files.readAllLines(source);

        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static void write() throws IOException {
        Path destination = Paths.get("C:\\Users\\andre\\IdeaProjects\\exercises\\java_advanced\\src\\main\\resources\\newrandomfile.txt");
        List<String> content = Arrays.asList("Lamborghini", "BMW", "Bentley");
        Files.write(destination,content, StandardOpenOption.APPEND);
    }
}
