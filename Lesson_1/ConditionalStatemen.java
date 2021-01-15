import java.util.Scanner;

public class ConditionalStatemen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Укажите ваш возраст.");
        int age = scan.nextInt();
        if (age > 20) {
            System.out.println("Вы можете продолжить. Укажите ваш пол.");
        }
        String gender = scan.next();
        if (gender != "male" || gender != "m" || gender != "м" || gender != "муж") {
            System.out.println("Продолжайте");
        }
        System.out.println("Укажите ваш рост в формате (м,см)");
        double growth = scan.nextDouble();
        if (growth < 1.80) {
            System.out.println("Ваш рост меньше 180см.");
        }
        else {
            System.out.println("Ваш рост больше 180см.");
        }
        System.out.println("Укажите ваше имя.");
        String name = scan.nextLine();
        /*
        if (c == 'M') {
            System.out.println("Ваше имя на M");
        }
        else if (c == 'I') {
            System.out.println("Ваше имя на I");
        }
        else {
            System.out.println("Привет " + name);
        }
        */
    }
}