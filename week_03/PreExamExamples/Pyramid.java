package com.greenfoxacademy.feladatok;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        System.out.println("Kérlek add meg a piramis sorainak számát: ");
        Scanner scanner = new Scanner(System.in);
        int rowsPyramid = scanner.nextInt(), k = 0;

        for (int i = 1; i <= rowsPyramid; ++i, k = 0) {
            for (int space = 1; space <= rowsPyramid - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }

}