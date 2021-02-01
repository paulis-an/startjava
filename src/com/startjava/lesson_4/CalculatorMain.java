package com.startjava.lesson_4;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "да";

        while (answer.equals("да")) {
            System.out.println("Введите математическое выражение: ");
            try {
                String mathExpression = scan.nextLine();
                String[] symbol = mathExpression.replaceAll(" ", "").split("[+, *, /, %, ^, -]");
                String mathSign = mathExpression.replaceAll(" ", "").replaceAll("[0-9]", "");
                int firstNumber = Integer.parseInt(symbol[0]);
                int secondNumber = Integer.parseInt(symbol[1]);
                Calculator calc = new Calculator(mathSign, firstNumber, secondNumber);

                System.out.println(calc.calculate());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели неправильное выражение");
            }

            do {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
