package com.greenfoxacademy.feladatok;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Kérlek adj meg egy számot: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.print(sum(inputNumber));
    }

    // - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.
// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
    public static int sum(int inputNumber) {
        int sum = 0, num = inputNumber;
        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;
//   nullától a bemeneti paraméterig és visszaadja azok összegét.
        }
        return sum;
    }
}