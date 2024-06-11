package com.kj.test4;

public class Person {
    // parent attributes
    private String name;
    private int age;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // eat func
    public void eat() {
        System.out.println("Person is eating");
    }
    // sleep func
    public void sleep() {
        System.out.println("Person is sleeping");
    }
    // shout func
    public void shout() {
        System.out.println("Person is shouting");
    }
}
