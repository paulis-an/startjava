package com.startjava.lesson_4.game;
/**
 * Lesson_4. Program "Guess number"
 *
 * @author Pavel Anisimov
 * @version  1.3 05.02.2021
 */

import java.util.Scanner;

public class GuessNumberMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "да";

        while (answer.equals("да")) {
            System.out.println("Введите имя игрока №1");
            Player player1 = new Player(scan.nextLine());
            System.out.println("Введите имя игрока №2");
            Player player2 = new Player(scan.nextLine());

            GuessNumber game = new GuessNumber(player1, player2);

            // запуск игры
            game.start(player1, player2);
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
