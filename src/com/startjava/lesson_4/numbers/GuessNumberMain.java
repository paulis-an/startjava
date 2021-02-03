package com.startjava.lesson_4.numbers;
/**
 * Lesson_4. Program "Guess number"
 *
 * @author Pavel Anisimov
 * @version 1.0
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumberMain gnm = new GuessNumberMain();
        String answer = "да";

        while (answer.equals("да")) {
            System.out.println("Введите имя игрока №1");
            String name1 = scan.nextLine();
            Player player1 = new Player(name1, gnm.inputNumbers());         // передаем игроков в Player
            System.out.println("Введите имя игрока №2");
            String name2 = scan.nextLine();
            Player player2 = new Player(name2, gnm.inputNumbers());

            GuessNumber game = new GuessNumber(player1, player2);

            game.start();                                                   // запуск игры
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }

    // метод ввода чисел игроками
    public int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа. У вас 10 попыток");
        int[] numbers = new int[10];
        try {                                                               // проверка на ввод числа
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неправильное значение");
        }
        return numbers;
    }
}
