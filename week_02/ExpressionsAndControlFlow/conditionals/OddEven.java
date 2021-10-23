package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.

        System.out.println("Kérlek adj meg egy (egész) számot, majd nyomd meg az entert: ");

        Scanner scanner = new Scanner(System.in);
        int userInputOddEven = scanner.nextInt();

        if (userInputOddEven % 2 == 0)
        System.out.println("A megadott szám: " + userInputOddEven + ", tehát páros.");
        else
        System.out.println("A megadott szám: " + userInputOddEven + ", tehát páratlan.");
    }
}
