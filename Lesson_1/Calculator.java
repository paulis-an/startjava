public class Calculator {
    public static void main(String[] args){
        int a = 10;
        int b = 2;
        char c = '^';
        
        if (c == '+') {
            System.out.println("Сумма чисел = " + (a + b));
        }
        
        else if (c == '-') {
            System.out.println("Разность чисел = " + (a - b));
        }

        else if (c == '*') {
            System.out.println("Произведение чисел = " + (a * b));
        }

        else if (c == '/') {
            if(b != 0) {
                System.out.println("Деление а на b = " + (a / b));
            } else {
                System.out.println("Деление на 0 запрещено");
            }
        }


        else if (c == '^') {
            int exp = a;
            if(b > 1) {
                for(int i = 2; i <=b ; i++){
                    exp *= a;
                }
            System.out.println("Возведение в степень b числа а = " + exp);
            }
            else if (b == 1) {
                System.out.println("Число в степени 1 равно самому себе и = " + a);
            }
            else {
                System.out.println("Число возведенное в 0 степень = 1");
            }
        }

        else {
            if(b != 0) {
                System.out.println("Остаток от деления = " + (a % b));
            } else {
                System.out.println("Деление на 0 запрещено");
            }
        }
    }
}
