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

    void start() {
        guessNumber = random.nextInt(101);
        System.out.println("Введите числа от 0 до 100. У вас 10 попыток");
        int index = 0;
        for (int i = 0; i < 10; i++) {
            index++;
            inputNumber(player1, i);
            checkNumber(player1, i);
            if (guessNumber == player1.getNumber(i)) {
                break;
            }
            inputNumber(player2, i);
            checkNumber(player2, i);
            if (guessNumber == player1.getNumber(i)) {
                break;
            }
        }
        if (index == 10 && player1.getNumber(index - 1) != guessNumber && player2.getNumber(index - 1) != guessNumber) {
            endGame(player1, index);
            endGame(player2, index);
        }
        System.out.println("Загаданное число - " + guessNumber);
        player1.resetArray(index - 1);
        player2.resetArray(index - 1);
    }

    private void inputNumber(Player player, int index) {
        System.out.println("Попытка " + (index + 1) + " игрока " + player.getName());
        int number = new Scanner(System.in).nextInt();
        if (number < 1 || number > 100) {
            System.out.println("Вы ввели число вне указанного диапазона");
        }
        player.setNumber(number, index);
    }

    private void checkNumber(Player player, int index) {
        if (player.getNumber(index) == guessNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber(index) + " с " + (index + 1) + " попытки");
            System.out.println(Arrays.toString(player.getNumbers(index + 1)));
        } else
            System.out.println((player.getNumber(index) > guessNumber ? "Введенное вами число больше того, что загадал компьютер" : "Введенное вами число меньше того, что загадал компьютер"));
    }

    private void outputNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void endGame(Player player, int index) {
        System.out.println("У " + player.getName() + " закончились попытки");
        outputNumbers(player.getNumbers(index));
    }
}


