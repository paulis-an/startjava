package com.startjava.lesson_4;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String mathSign;

    public Calculator(String mathSign, int firstNumber, int secondNumber) {
        this.mathSign = mathSign;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String calculate() {
        switch (mathSign) {
            case "+":
                return "Сумма чисел = " + (firstNumber + secondNumber);
            case "-":
                return "Разность чисел = " + (firstNumber - secondNumber);
            case "*":
                return "Произведение чисел = " + (firstNumber * secondNumber);
            case "/":
                if (secondNumber != 0) {
                    return "Деление числа " + firstNumber + " на число " + secondNumber + " = " + ((double) firstNumber / (double) secondNumber);
                } else {
                    return "Деление на 0 запрещено";
                }
            case "^":
                return "Число " + firstNumber + " в степени " + secondNumber + " = " + Math.pow(firstNumber, secondNumber);
            case "%":
                if (secondNumber != 0) {
                    return "Остаток от деления числа " + firstNumber + " на число " + secondNumber + " = " + (firstNumber % secondNumber);
                } else {
                    return "Деление на 0 запрещено";
                }
            default:
                return "Вы ввели неправильный знак математической операции";
        }
    }
}

