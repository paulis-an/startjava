package com.startjava.lesson_2.jaeger;

class Jaeger {
    private String name;
    private String mark;
    private double weight;
    private int speed;
    private int armor;

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
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
