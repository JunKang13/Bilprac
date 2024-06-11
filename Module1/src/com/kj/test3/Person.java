package com.kj.test3;

public class Person {
    // constructor
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    // attributes
    String name;
    int age;
    double height;

    // actions
    // study
    public void study() {
        System.out.println(name + " is studying.");
    }
}
