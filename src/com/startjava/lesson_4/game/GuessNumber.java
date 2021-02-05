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

    public void start(Player player1, Player player2) {
        guessNumber = random.nextInt(21);
        play(player1);
        play(player2);
        compareGame();
    }

    public void play(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + ", введите числа от 0 до 100. У вас 10 попыток");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            player.setNumbers(number, i);
            if (number < 0 || number > 100) {
                System.out.println("Вы ввели число вне указанного диапазона");
            }
        }
    }

    //метод проверки чисел
    public void compareGame() {
        for (int i = 0; i < player1.getNumbers().length; i++) {
            if (player1.getNumbers()[i] == guessNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumbers()[i] + " с " + (i + 1) + " попытки");
                System.out.println(Arrays.toString(Arrays.copyOf(player1.getNumbers(), i + 1)));
                break;
            } else if (player2.getNumbers()[i] == guessNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumbers()[i] + " с " + (i + 1) + " попытки");
                System.out.println(Arrays.toString(Arrays.copyOf(player2.getNumbers(), i + 1)));
                break;
            } else if (i == player1.getNumbers().length - 1) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
                System.out.println("Загаданное число - " + guessNumber);
            }
        }
        outputNumbers(player1.getNumbers());
        outputNumbers(player2.getNumbers());
    }

    //метод вывода чисел введенных игроками
    void outputNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


