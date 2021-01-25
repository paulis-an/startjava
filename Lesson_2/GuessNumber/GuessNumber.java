import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    static int guessNumber;
    boolean ans = true;
    int attempt = 0;

    public void guessNumberMethod() {
        guessNumber = random.nextInt(100);
        System.out.println("Введите имя игрока №1");
        Player player1 = new Player();
        player1.setName(scanner.nextLine());
        System.out.println("Введите имя игрока №2");
        Player player2 = new Player();
        player2.setName(scanner.nextLine());

        while(ans == true) {
            attempt++;
            System.out.println("Попытка № " + attempt + " игрока - " + player1.getName());
            System.out.println("Введите Число");
            int inputNumber1 = scanner.nextInt();
            if (inputNumber1 == guessNumber) {
                System.out.println("Выиграл " + player1.getName());
                ans = false;
                break;
            } else if (inputNumber1 > guessNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");

            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
            System.out.println("Попытка № " + attempt + " игрока - " + player2.getName());
            System.out.println("Введите Число");
            int inputNumber2 = scanner.nextInt();
            if(inputNumber2 == guessNumber) {
                System.out.println("Выиграл " + player2.getName());
                ans = false;
            } else if (inputNumber2 > guessNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
        }
    }
}