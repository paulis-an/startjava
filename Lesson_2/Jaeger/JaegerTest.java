class JaegerTest {
    public static void main(String[] args) {
        Jaeger j1 = new Jaeger();
        Jaeger j2 = new Jaeger();

        j1.setName("Gipsy Danger");
        j1.setMark("Mark-3");
        j1.setWeight(1.98);
        j1.setSpeed(7);
        j1.setArmor(6);

        j1.call(j1.getName(), j1.getMark(), j1.getWeight(), j1.getSpeed(), j1.getArmor());

        j1.run();

        j1.shoot();

        j1.scan();

        System.out.println();

        j2.setName("Striker Eureka");
        j2.setMark("Mark-5");
        j2.setWeight(1.85);
        j2.setSpeed(10);
        j2.setArmor(9);

        j2.call(j2.getName(), j2.getMark(), j2.getWeight(), j2.getSpeed(), j2.getArmor());

        j2.run();

        j2.shoot();

        j2.jump();
    }
}
