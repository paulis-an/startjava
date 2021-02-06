package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int index) {
        numbers[index] = number;
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(numbers, index + 1);
    }

    public void resetArray(int index2) {
        Arrays.fill(numbers, 0, index2, 0);
    }
}