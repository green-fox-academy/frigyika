package com.greenfoxacademy.feladatok;

public class Reversed {
    public static void main(String[] args) {

        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String reversedString = "";
        for (int i = toBeReversed.length() - 1; i >= 0; i--) {
            reversedString = reversedString + toBeReversed.charAt(i);
            System.out.println(reversedString);
        }


    }
// Készíts egy függvényt ami megfordít egy Stringet, amit
// bemeneti paraméterként kap.
// Használd a függvényt a "toBeReversed" változón ellenőrzésként.
// Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
// opcionálisan akárhogy.

}
