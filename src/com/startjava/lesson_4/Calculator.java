package com.startjava.lesson_4;

import java.util.Arrays;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String mathExpression;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void calculate() {
        try {
            String symbol = mathExpression.replaceAll(" ", "");
            int[] numbers = Arrays.stream(symbol.split("[+, *, /, %, ^, -]")).mapToInt(Integer::parseInt).toArray();
            setFirstNumber(numbers[0]);
            setSecondNumber(numbers[1]);

            if (symbol.contains("+")) {
                System.out.println("Сумма чисел = " + (firstNumber + secondNumber));
            } else if (symbol.contains("-")) {
                System.out.println("Разность чисел = " + (firstNumber - secondNumber));
            } else if (symbol.contains("*")) {
                System.out.println("Произведение чисел = " + (firstNumber * secondNumber));
            } else if (symbol.contains("/")) {
                if (secondNumber != 0) {
                    System.out.println("Деление числа " + firstNumber + " на число " + secondNumber + " = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Деление на 0 запрещено");
                }
            } else if (symbol.contains("^")) {
                int exp = 1;
                for (int i = 0; i < secondNumber; i++) {
                    exp *= firstNumber;
                }
                System.out.println("Число " + firstNumber + " в степени " + secondNumber + " = " + exp);
            } else if (symbol.contains("%")) {
                if (secondNumber != 0) {
                    System.out.println("Остаток от деления числа " + firstNumber + " на число " + secondNumber + " = " + (firstNumber % secondNumber));
                } else {
                    System.out.println("Деление на 0 запрещено");
                }
            } else {
                System.out.println("Вы ввели неправильный знак математической операции");
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели неправильное выражение");
        }
    }
}
