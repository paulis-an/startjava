import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    boolean ans = true;
    int attempt = 0;

    public void result(String name1,String name2, int guessNumber) {

        while(ans == true) {
            attempt++;
            System.out.println("Попытка № " + attempt + " игрока - " + name1);
            System.out.println("Введите Число");
            int inputNumber1 = scanner.nextInt();
            if(inputNumber1 == guessNumber) {
                System.out.println("Выиграл " + name1);
                ans = false;
                break;
            } else if(inputNumber1 > guessNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");

            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
                System.out.println("Попытка № " + attempt + " игрока - " + name2);
                System.out.println("Введите Число");
                int inputNumber2 = scanner.nextInt();
                if(inputNumber2 == guessNumber) {
                    System.out.println("Выиграл " + name2);
                    ans = false;
                } else if(inputNumber2 > guessNumber) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            break;
        }
    }
}
