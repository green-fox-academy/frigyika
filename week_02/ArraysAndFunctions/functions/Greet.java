package com.greenfoxacademy.functions;

// - Hozz létre egy class-t `Greet` névvel és benne a main függvényt.
public class Greet {
    public static void main(String[] args) {
// - greet(`name`)
        greet();
    }

    // - Készíts egy függvényt `greet` névvel mely üdvözli a bemeneti paraméterét kiírással(void & print)
    public static void greet() {
// - Hozz létre egy `name` nevű String változót, aminek az értéke legyen `Green Fox`.
        String name = "Green Fox";
//   pl.: `Üdv, kedves Green Fox`
        System.out.println("Üdv, kedves " + name);
    }
}
