package com.greenfoxacademy.type;

public class CodingHours {
    public static void main(String[] args) {

        int semester = 17;
        int workingHoursPerDay = 6;
        int workingDaysPerWeek = 5;
        int workingHoursPerWeek = 52;
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        System.out.println("Egy hallgató, egy félév során " + semester * workingDaysPerWeek * workingHoursPerDay + " órát kódol, ha csak hétköznap dolgozik.");
        //
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        System.out.println("Ez a hallgató, a félév hasznos munkaidejének " + (float) workingDaysPerWeek * workingHoursPerDay * 100 / workingHoursPerWeek + " %-át tölti kódolással.");
        // ha az átlagos heti munkaidő 52 óra
    }
}
