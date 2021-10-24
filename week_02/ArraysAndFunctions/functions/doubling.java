package com.greenfoxacademy.functions;

public class doubling {
    public static void main(String[] args) {
        int baseNum = 123;
        int doubleNum = 2;
        int doubledNum = doublingmethod(baseNum, doubleNum);
        System.out.println("A kiindulás szám (123) duplája: " + doubledNum);
    }

    public static int doublingmethod(int baseNum, int doubleNum) {
        return baseNum * doubleNum;
    }
}

