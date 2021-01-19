public class Calculator {
    int firstNumber;
    int secondNumber;
    String mathSign;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void run(int firstNumber, int secondNumber) {
        switch(mathSign) {
            case "+":   
                System.out.println("Сумма чисел = " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Разность чисел = " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Произведение чисел = " + (firstNumber * secondNumber));
                break;
            case "/":
                if(secondNumber != 0) {
                    System.out.println("Деление числа " + firstNumber + " на число " + secondNumber + " = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Деление на 0 запрещено");
                }
                break;
            case "^":
                int exp = firstNumber;
                if(secondNumber > 1) {
                    for(int i = 1; i < secondNumber ; i++) {
                        exp *= firstNumber;
                    }
                    System.out.println("Число " + firstNumber + " в степени " + secondNumber + " = " + exp);
                } else if(secondNumber == 1) {
                    System.out.println("Число в степени 1 равно самому себе и = " + firstNumber);
                } else {
                    System.out.println("Число возведенное в 0 степень = 1");
                }
                break;
            case "%":
                if(secondNumber != 0) {
                    System.out.println("Остаток от деления числа " + firstNumber + " на число " + secondNumber + " = " + (firstNumber % secondNumber));
                } else {
                    System.out.println("Деление на 0 запрещено");
                }
                break;
            default:
            System.out.println("Вы ввели неправильный знак математической операции");
        }
    }
}


