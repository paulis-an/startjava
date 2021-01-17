class Wolf {
    String gender;
    int weight;
    int age;
    String color;

    public void go() {
        System.out.println("Wolf is go");
    }
    public void sit() {
        System.out.println("Wolf is sit");
    }
    public void run() {
        System.out.println("Wolf is run");
    }
    public void howl() {
        System.out.println("Wolf is howl");
    }
    public void hunt() {
        System.out.println("Wolf is hunt");
    }
}

public class WolfTest {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.gender = "male";
        w.weight = 50;
        w.age = 5;
        w.color = "black";
        System.out.println(w.gender);
        System.out.println(w.weight);
        System.out.println(w.age);
        System.out.println(w.color);

        w.go();
        w.sit();
        w.run();
        w.howl();
        w.hunt();
    }
}