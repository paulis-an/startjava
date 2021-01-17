public class Wolf {
    String gender;
    int weight;
    int age;
    String color;

    public void go() {

    }
    public void sit() {

    }
    public void run() {

    }
    public void howl() {

    }
    public void hunt() {

    }
}

class WolfTest {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.gender = "male";
        w.weight = 50;
        w.age = 5;
        System.out.println(w.gender);
    }

}