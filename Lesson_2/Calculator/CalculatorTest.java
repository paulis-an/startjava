import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;

        do {
        System.out.println("Введите первое число:");
        calc.firstNumber = scan.nextInt();
        System.out.println("Введите знак математической операции: + - * / ^ %");
        calc.mathSign = scan.next();
        System.out.println("Введите второе число:");
        calc.secondNumber = scan.nextInt();

        calc.operation(calc.mathSign);

        System.out.println("Хотите продолжить вычисления? [да/нет]:");
        answer = scan.next();
        } while(answer.equals("нет"));
    }
}