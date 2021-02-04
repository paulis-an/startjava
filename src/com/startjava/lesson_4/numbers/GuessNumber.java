package com.startjava.lesson_4.numbers;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private int guessNumber;
    private Player player1;
    private Player player2;
    private int[] inputNumbers;

    public GuessNumber() {
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        guessNumber = random.nextInt(101);
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

    // метод ввода чисел
    public int[] getInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа от 0 до 100. У вас 10 попыток");
        inputNumbers = new int[10];
        try {                                                                           // проверка - введено число или нет
            for (int i = 0; i < inputNumbers.length; i++) {
                inputNumbers[i] = scanner.nextInt();
                if (inputNumbers[i] < 0 || inputNumbers[i] > 100) {                        // проверка на ввод числа в указанном диапазоне
                    System.out.println("Вы ввели число вне указанного диапазона");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неправильное значение");
        }
        return inputNumbers;
    }

    //метод вывода чисел введенных игроками
    public void outputNumbers(int[] numbers) {
        for (int a : numbers) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

