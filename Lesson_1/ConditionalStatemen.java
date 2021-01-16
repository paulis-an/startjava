public class ConditionalStatemen {
    public static void main(String[] args) {
        int age = 22;
        if(age > 20) {
            System.out.println("Возраст - " + age);
        }

        String gender = "Male";
        if(gender == "Male") {
            System.out.println("Пол мужской");
        }
        if(gender != "Male") {
            System.out.println("Пол женский");
        }

        double growth = 1.75;
        if(growth < 1.80) {
            System.out.println("Ваш рост меньше 180см");
        }
        else {
            System.out.println("Ваш рост больше 180см");
        }

        char firstLetter = 'M';
        if(firstLetter == 'M') {
            System.out.println("Имя начинается на " + firstLetter);
        } else if(firstLetter == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Имя начинается с другой буквы");
        }
    }
}