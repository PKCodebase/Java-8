package com.program;


interface Calculator {
    int operate(int a, int b);
//    int operate2(int a, int b);
}

public class FunctionalInterfaceProblem {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println(add.operate(5, 3)); // Output: 8
        System.out.println(subtract.operate(5, 3)); // Output: 2
    }
}

