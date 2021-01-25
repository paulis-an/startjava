import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "да";

        while (answer.equals("да")) {
            System.out.println("Введите первое число:");
            calc.setFirstNumber(scan.nextInt());
            System.out.println("Введите знак математической операции: + - * / ^ %");
            calc.setMathSign(scan.next());
            System.out.println("Введите второе число:");
            calc.setSecondNumber(scan.nextInt());

            calc.calculate();

            do {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                answer = scan.next();
            } while(!answer.equals("да") && !answer.equals("нет"));
        }
    }
}

