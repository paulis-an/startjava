package com.startjava.lesson_4.numbers;

public class Player {
    private String name;
    private int[] numbers;

    public Player(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }
}