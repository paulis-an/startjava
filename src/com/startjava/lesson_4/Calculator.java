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
        try {
            switch (mathSign) {
                case "+":
                    return firstNumber + secondNumber;
                case "-":
                    return firstNumber - secondNumber;
                case "*":
                    return firstNumber * secondNumber;
                case "/":
                    return firstNumber / secondNumber;
                case "^":
                    return (int) Math.pow(firstNumber, secondNumber);
                case "%":
                    return firstNumber % secondNumber;
                default:
                    System.out.println("Вы ввели неправильный знак математической операции");
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 запрещено");
        }
        return 0;
    }
}
