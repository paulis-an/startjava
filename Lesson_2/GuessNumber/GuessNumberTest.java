import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber guess = new GuessNumber();
        String answer = "да";
        while(answer.equals("да")) {

            guess.guessNumberMethod();

            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                answer = scan.next();
                guess.attempt = 0;
            } while(!answer.equals("да") && !answer.equals("нет"));
            guess.ans = true;
        }
    }
}