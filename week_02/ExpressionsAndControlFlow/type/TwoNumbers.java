package com.greenfoxacademy.type;

public class TwoNumbers {
    public static void main(String[] args) {

        int firstNumber = 22;
        int secondNumber = 13;

        // Írj egy programot, ami kiírja pár számbéli operáció eredményét 22-vel és 13-mal

        // Írasd ki 13 és 22 összegét
        System.out.println(firstNumber + secondNumber);
        // Írasd ki 13 és 22 különbségét
        System.out.println(secondNumber - firstNumber);
        // Írasd ki 13 és 22 szorzatát
        System.out.println(firstNumber * secondNumber);
        // Írasd ki 22-őt osztva 13-mal művelet eredményét (törtszám)
        System.out.println((double) firstNumber / secondNumber);
        // Írasd ki egész számként a 22 osztva 13-mal művelet eredményét
        System.out.println((long) firstNumber / secondNumber);
        // Írasd ki 22-őt osztva 13-mal művelet osztási maradékát.
        System.out.println(firstNumber % secondNumber);
    }
}
