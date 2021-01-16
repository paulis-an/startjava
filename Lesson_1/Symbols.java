public class Symbols {
    public static void main(String[] args) {
        char c = 9398;
        while(c < 10179) {
            System.out.print(c + " ");
            if(c % 10 == 0) {
            System.out.println();
            }
            c++;
        }
    }
}