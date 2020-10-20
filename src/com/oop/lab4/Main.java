package com.oop.lab4;

public class Main {
    public static void main(String[] args) {
        Evaluate first = new Evaluate("2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))");
        System.out.println(first.eval());
    }
}
