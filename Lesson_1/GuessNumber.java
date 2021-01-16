public class GuessNumber {
    public static void main(String[] args) {
        int guessNum = 75;
        int input = 25;

        if(input== guessNum) {
            System.out.println("Вы отгадали!");
        } else if(input > guessNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            while(input != guessNum) {
                input -= 1;
            }
            System.out.println("Вы отгадали! Это число " + input);
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
            while(input != guessNum) {
                input += 1;
            }
            System.out.println("Вы отгадали! Это число " + input);
        }
    }
}