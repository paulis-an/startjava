package com.startjava.lesson_4.numbers;

public class Player {
    private String name;
    GuessNumber gn = new GuessNumber();
    private int[] inputNumbers = gn.getInputNumbers().clone();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return inputNumbers;
    }
}