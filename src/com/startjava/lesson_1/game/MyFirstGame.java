package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int guessNum = 75;
        int inputNumber = 25;

        while(inputNumber != guessNum) {
            if(inputNumber > guessNum) {
                System.out.println("Введенное вами число " + inputNumber +" больше того, что загадал компьютер");
                inputNumber--;
            } if(inputNumber < guessNum) {
                System.out.println("Введенное вами число " + inputNumber + " меньше того, что загадал компьютер");
                inputNumber++;
            }
         }
         System.out.println("Вы отгадали! Это число = " + guessNum);
    }
}