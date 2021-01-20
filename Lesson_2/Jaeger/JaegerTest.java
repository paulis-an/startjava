class JaegerTest {
    public static void main(String[] args) {
        Jaeger j1 = new Jaeger();
        Jaeger j2 = new Jaeger();

        j1.setName("Gipsy Danger");
        j1.setMark("Mark-3");
        j1.setWeight(1.98);
        j1.setSpeed(7);
        j1.setArmor(6);

        System.out.println(j1.heading());
        System.out.println(j1);
        j1.run();
        j1.shoot();
        j1.scan();

        System.out.println();

        j2.setName("Striker Eureka");
        j2.setMark("Mark-5");
        j2.setWeight(1.85);
        j2.setSpeed(10);
        j2.setArmor(9);

        System.out.println(j2.heading());
        System.out.println(j2);
        j2.run();
        j2.shoot();
        j2.jump();
    }
}
