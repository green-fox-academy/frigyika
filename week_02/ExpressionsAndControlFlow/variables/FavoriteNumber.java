package com.greenfoxacademy.variables;

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        int favoriteNumber;

        System.out.println("Kérem add meg a kedvenc (egész) számodat numerikusan: ");

        Scanner scanner = new Scanner(System.in);
        favoriteNumber = scanner.nextInt();

        System.out.println("A kedvenc számod: " + favoriteNumber);

    }
}
