package com.startjava.lesson_4.Calculator;

import com.startjava.lesson_4.Calculator.Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "да";

        while (answer.equals("да")) {
            System.out.println("Введите математическое выражение: ");
            try {
                Calculator calc = new Calculator(scan.nextLine());
                System.out.println("Ответ = " + calc.calculate());
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
