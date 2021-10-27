package com.greenfoxacademy.feladatok;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
// Írj egy programot, ami a standard input-ból kér egy számot és
// elmenti azt a number változóban, majd
// kiírja a number változóban megadott számhoz a szorzótáblát
        System.out.println("Kérlek addj meg egy számot: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
// Hozz létre egy egész szám típusú, number elnevezésű változót
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", number, i, number * i);

        }
    }
}
