class Wolf {
    private String gender;
    private int weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        if(a > 8) {
            System.out.println("Некорректный возраст");
        } else {
            age = a;
        }
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

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