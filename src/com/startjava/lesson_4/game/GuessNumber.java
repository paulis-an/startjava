package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private int guessNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        guessNumber = random.nextInt(101);
        inputNumbers();
        game();
    }

    // метод ввода чисел
    private void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player1.getName() + ", введите числа от 0 до 100. У вас 10 попыток");
        for (int i = 0; i < 10; i++) {
            int number1 = scanner.nextInt();
            player1.setNumbers1(number1, i);
            if (number1 < 0 || number1 > 100) {
                System.out.println("Вы ввели число вне указанного диапазона");
            }

        }
        System.out.println("Игрок " + player2.getName() + ", введите числа от 0 до 100. У вас 10 попыток");
        for (int i = 0; i < 10; i++) {
            int number2 = scanner.nextInt();
            player2.setNumbers2(number2, i);
            if (number2 < 0 || number2 > 100) {
                System.out.println("Вы ввели число вне указанного диапазона");
            }

        }
    }

    //метода проверки чисел игроков
    public void game() {
        for (int i = 0; i < player1.getNumbers1().length; i++) {
            if (player1.getNumbers1()[i] == guessNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumbers1()[i] + " с " + (i + 1) + " попытки");
                System.out.println(Arrays.toString(Arrays.copyOf(player1.getNumbers1(), i + 1)));
                break;
            } else if (player2.getNumbers2()[i] == guessNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumbers2()[i] + " с " + (i + 1) + " попытки");
                System.out.println(Arrays.toString(Arrays.copyOf(player2.getNumbers2(), i + 1)));
                break;
            } else if (i == player1.getNumbers1().length - 1) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
                System.out.println("Загаданное число - " + guessNumber);
            }
        }
        outputNumbers(player1.getNumbers1());
        outputNumbers(player2.getNumbers2());
    }

    //метод вывода чисел введенных игроками
    void outputNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


