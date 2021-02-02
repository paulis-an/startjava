package com.startjava.lesson_4.Calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String mathSign;


    public Calculator(String mathExp) {
        String mathExpression = mathExp;
        String[] symbol = mathExpression.replaceAll(" ", "").split("[+, *, /, %, ^, -]");
        mathSign = mathExpression.replaceAll(" ", "").replaceAll("[0-9]", "");
        firstNumber = Integer.parseInt(symbol[0]);
        secondNumber = Integer.parseInt(symbol[1]);
    }

    public int calculate() {
        switch (mathSign) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                try {
                    return firstNumber / secondNumber;
                } catch (ArithmeticException e) {
                    System.out.println("Деление на 0 запрещено");
                }
                break;
            case "^":
                return (int) Math.pow(firstNumber, secondNumber);
            case "%":
                try {
                    return firstNumber % secondNumber;
                } catch (ArithmeticException e) {
                    System.out.println("Деление на 0 запрещено");
                }
                break;
        }
        return 0;
    }
}
