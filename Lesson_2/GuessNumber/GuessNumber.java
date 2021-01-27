import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int guessNumber;
    private int attempt;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        guessNumber = random.nextInt(101);
        try {
            while(true) {
                attempt++;
                System.out.println("Попытка № " + attempt + " игрока - " + player1.getName());
                System.out.println("Введите Число");
                int inputNumber1 = scanner.nextInt();
                if (inputNumber1 == guessNumber) {
                    System.out.println("Выиграл " + player1.getName());
                    attempt = 0;
                    break;
                } else if(inputNumber1 > guessNumber) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
                
                System.out.println("Попытка № " + attempt + " игрока - " + player2.getName());
                System.out.println("Введите Число");
                int inputNumber2 = scanner.nextInt();
                if(inputNumber2 == guessNumber) {
                    System.out.println("Выиграл " + player2.getName());
                    attempt = 0;
                    break;
                } else if(inputNumber2 > guessNumber) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            }
        } catch(InputMismatchException e) {
            System.out.println("Ошибка ввода числа");
        }
    }
}