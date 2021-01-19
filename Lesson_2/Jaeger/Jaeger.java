class Jaeger {
    private String name;
    private String mark;
    private double weight;
    private int speed;
    private int armor;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }

    public void run() {
        System.out.println("Робот " + name + " - может бегать");
    }
    public void shoot() {
        System.out.println("Робот " + name + " - может стрелять");
    }

    public void scan () {
        System.out.println("Робот " + name + " - может сканировать");
    }

    public void jump () {
        System.out.println("Робот " + name + " - может прыгать");
    }

    public void call(String name, String mark, double weight, int speed, int armor) {
        System.out.println("Название робота: " + name + " Модель: " + mark + " Вес: " + weight + " Скорость: " + " Броня: " + armor);
    }
}
