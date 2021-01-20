class JaegerTest {
    public static void main(String[] args) {
        Jaeger j1 = new Jaeger("Gipsy Danger", "Mark-3", 1.98, 7, 6);
        Jaeger j2 = new Jaeger("Striker Eureka", "Mark-5", 1.85, 10, 9);
        j1.setCountry("China");
        j2.setCountry("Canada");

        System.out.println(j1.heading());
        System.out.println(j1);
        j1.run();
        j1.shoot();
        j1.scan();
        j1.produce();

        System.out.println();

        System.out.println(j2.heading());
        System.out.println(j2);
        j2.run();
        j2.shoot();
        j2.jump();
        j2.produce();
    }
}
