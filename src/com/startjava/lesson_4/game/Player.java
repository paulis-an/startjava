package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers1 = new int[10];
    private int[] numbers2 = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void setNumbers1(int number, int position) {
        numbers1[position] = number;
    }

    public int[] getNumbers1() {
        return Arrays.copyOf(numbers1, numbers1.length);
    }

    public void setNumbers2(int number, int position) {
        numbers2[position] = number;
    }

    public int[] getNumbers2() {
        return Arrays.copyOf(numbers2, numbers2.length);
    }

    public String getName() {
        return name;
    }
}