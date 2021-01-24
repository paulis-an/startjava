import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        GuessNumber guess = new GuessNumber();


         String answer = "да";
         while(answer.equals("да")) {
             guess.ans = true;
             Player guessNumber = new Player(random.nextInt(100));
             System.out.println("Введите имя игрока №1");
             Player player1 = new Player(scan.nextLine());
             System.out.println("Введите имя игрока №2");
             Player player2 = new Player(scan.nextLine());
             while(true == guess.ans) {
                guess.result(player1.getName(), player2.getName(), guessNumber.getNumber());
             }
             while(true) {
                 System.out.println("Хотите продолжить игру? [да/нет]:");
                 answer = scan.next();
                 System.out.println(answer);
                 if(answer.equals("нет") || answer.equals("да")) {
                     guess.attempt = 0;
                     break;
                 }
            }
        }
    }
}