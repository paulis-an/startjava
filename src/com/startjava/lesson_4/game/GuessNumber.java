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
        guessNumber = random.nextInt(21);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа от 0 до 100. У вас 10 попыток");
        int index = 0;
        for (int i = 0; i < 10; i++) {
            index++;
            System.out.println("Попытка " + (i + 1) + " игрока " + player1.getName());
            int number1 = scanner.nextInt();
            compareNumbers(number1);
            player1.setNumber(number1, i);
            if (number1 == guessNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + number1 + " с " + index + " попытки");
                System.out.println(Arrays.toString(player1.getNumbers(i)));
                break;
            } else if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                outputNumbers(player1.getNumbers(index - 1));
            }

            System.out.println("Попытка " + (i + 1) + " игрока " + player2.getName());
            int number2 = scanner.nextInt();
            compareNumbers(number2);
            player2.setNumber(number2, i);
            if (number2 == guessNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + number2 + " с " + index + " попытки");
                System.out.println(Arrays.toString(player2.getNumbers(i)));
                break;
            } else if (i == 9) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                outputNumbers(player2.getNumbers(index - 1));
                System.out.println("Загаданное число - " + guessNumber);
            }
        }
        player1.resetArray(index);
        player2.resetArray(index);
    }

    //метод проверки чисел
    public void compareNumbers(int number) {
        if (number < 0 || number > 100) {
            System.out.println("Вы ввели число вне указанного диапазона");
        }
    }

    //метод вывода чисел введенных игроками
    void outputNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


