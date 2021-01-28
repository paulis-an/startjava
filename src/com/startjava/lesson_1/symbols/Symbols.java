package com.startjava.lesson_1.symbols;

public class Symbols {
    public static void main(String[] args) {
        for(char c = 9398; c < 10179; c++) {
            System.out.print(c + " ");
            if(c % 10 == 0) {
                System.out.println();
            }
        }
    }
}