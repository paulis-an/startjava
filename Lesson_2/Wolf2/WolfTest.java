public class WolfTest {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        
        w.setGender("male");
        w.setWeight(40);
        w.setAge(7);
        w.setColor("white");

        System.out.println("gender - " + w.getGender());
        System.out.println("weight - " + w.getWeight());
        System.out.println("age - " + w.getAge());
        System.out.println("color - " + w.getColor());

        System.out.println();

        w.go();
        w.sit();
        w.run();
        w.howl();
        w.hunt();
    }
}