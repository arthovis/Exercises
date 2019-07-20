package com.andrei.exercises.exceptions;

import java.util.Scanner;

public class DemoCatchMultipleExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        multipleCatch(input);
    }

    private static void multipleCatch(Scanner input) {
        while (input.hasNext()) {
            String line = input.nextLine();
            try {
                int i = Integer.parseInt(line);
                System.out.println("Numarul este: " + i);
            } catch (NumberFormatException e) {
                try {
                    double d = Double.parseDouble(line);
                    System.out.println("Numarul este: " + d);
                } catch (NumberFormatException e1) {
                    System.out.println("Nu e numar. Learn your numbers, bitch!");
                    e1.printStackTrace();
                    break;
                }
            }
        }
    }
}
