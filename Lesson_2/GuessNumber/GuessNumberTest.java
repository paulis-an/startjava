import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "да";
        while(answer.equals("да")) {
            System.out.println("Введите имя игрока №1");
            Player player1 = new Player(scan.nextLine());
            System.out.println("Введите имя игрока №2");
            Player player2 = new Player(scan.nextLine());
            GuessNumber game = new GuessNumber(player1, player2);

            game.start();
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                answer = scan.next();
            } while(!answer.equals("да") && !answer.equals("нет"));
        }
    }
}