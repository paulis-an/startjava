public class WolfTest {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.gender = "male";
        w.weight = 50;
        w.age = 5;
        w.color = "black";
        System.out.println("gender - " + w.gender);
        System.out.println("weight - " + w.weight);
        System.out.println("age - " + w.age);
        System.out.println("color - " + w.color);

        w.go();
        w.sit();
        w.run();
        w.howl();
        w.hunt();
    }
}