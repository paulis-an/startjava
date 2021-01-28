package com.startjava.lesson_1.number;

public class GuessNumber {
    public static void main(String[] args) {
        int guessNum = 75;
        int inputNumber = 25;

        if(inputNumber == guessNum) {
            System.out.println("Вы отгадали!");
        } else if(inputNumber > guessNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            while(inputNumber != guessNum) {
                inputNumber--;
            }
            System.out.println("Вы отгадали! Это число " + inputNumber);
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
            while(inputNumber != guessNum) {
                inputNumber++;
            }
            System.out.println("Вы отгадали! Это число " + inputNumber);
        }
    }
}