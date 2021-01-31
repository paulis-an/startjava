package com.startjava.lesson_4;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "да";

        while (answer.equals("да")) {
            System.out.println("Введите математическое выражение: ");
            Calculator calc = new Calculator(scan.nextLine());

            calc.calculate();

            do {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
