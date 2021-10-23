package com.greenfoxacademy.scanner;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben
        System.out.println("Kérem add meg a konvertálandó távolságot mérföldben:");
        Scanner scanner = new Scanner(System.in);
        double userInputDistanceMiles = scanner.nextDouble();
        double mileToKmConversionNumber = 1.609344;

        System.out.println("A megadott távolság Km-re konvertálva: " + userInputDistanceMiles * mileToKmConversionNumber + " Km.");

    }
}
