package com.startjava.lesson_4.numbers;


import java.util.Arrays;
import java.util.Random;

public class GuessNumber {
    Random random = new Random();
    private int guessNumber;
    private int attempt;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        guessNumber = random.nextInt(101);
        for (int i = 0; i < player1.getNumbers().length; i++) {
            if (player1.getNumbers()[i] == guessNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumbers()[i] + " с " + (i + 1) + " попытки");
                System.out.println(Arrays.toString(Arrays.copyOf(player1.getNumbers(), i)));
                break;
            } else if (player2.getNumbers()[i] == guessNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumbers()[i] + " с " + (i + 1) + " попытки");
                System.out.println(Arrays.toString(Arrays.copyOf(player2.getNumbers(), i)));
                break;
            } else if (i == player1.getNumbers().length - 1) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
                System.out.println("Загаданное число - " + guessNumber);
            }
        }
        endGame();
    }

    //метод вывода чисел введенных игроками
    public void endGame() {
        System.out.println(Arrays.toString(player1.getNumbers()));
        System.out.println(Arrays.toString(player2.getNumbers()));
    }
}

