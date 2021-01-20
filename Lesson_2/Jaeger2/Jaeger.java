class Jaeger {
    private String name;
    private String mark;
    private double weight;
    private int speed;
    private int armor;
    
    public Jaeger(String name, String mark, double weight, int speed, int armor) {
        this.name = name;
        this.mark = mark;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
    }
    
    // Добавил страну производства. Реализовал через setter
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    public void produce() {
        System.out.println("Страна производства: " + country);
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

    public String heading() {
        return "Название робота:\tМодель:\tВес:\tСкорость:\tБроня:";
    }

    public String toString() {
        return name + "\t\t" + mark + "\t" + weight + "\t" + speed + "\t\t" + armor;
    }
}
