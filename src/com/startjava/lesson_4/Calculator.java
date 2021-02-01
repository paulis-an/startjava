package com.startjava.lesson_4;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String mathSign;
    String mathExpression;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
        String[] symbol = mathExpression.replaceAll(" ", "").split("[+, *, /, %, ^, -]");
        mathSign = mathExpression.replaceAll(" ", "").replaceAll("[0-9]", "");
        firstNumber = Integer.parseInt(symbol[0]);
        secondNumber = Integer.parseInt(symbol[1]);
    }

    public int calculate() {
        int value = 0;
        switch (mathSign) {
            case "+":
                value = firstNumber + secondNumber;
                break;
            case "-":
                value = firstNumber - secondNumber;
                break;
            case "*":
                value = firstNumber * secondNumber;
                break;
            case "/":
                value = firstNumber / secondNumber;
                break;
            case "^":
                value = (int) Math.pow(firstNumber, secondNumber);
                break;
            case "%":
                value = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Вы ввели неправильный знак математической операции");
                break;
        }
        return value;
    }
}

