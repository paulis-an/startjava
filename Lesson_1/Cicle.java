public class Cicle {
    public static void main(String[] args) {
        for(int i = 0; i < 21; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int x = 6;
        int y = -7;
        while(x > y) {
            System.out.print(x + " ");
            x = x - 2;
        }
        System.out.println();

        int k = 10;
        int result = 0;
        do {
            if(k % 2 != 0) {
                result += k; 
            }
            else {
            }
            k++;
        } while(k < 21);
        System.out.println("Результат суммы нечетных чисел от 10 до 20 = " + result);
    }
}