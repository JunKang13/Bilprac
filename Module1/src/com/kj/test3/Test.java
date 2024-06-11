package com.kj.test3;
/**
 * This is a test class.
 */
public class Test {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.name = "John";
//        p1.age = 30;
//        p1.height = 175;
//        System.out.println("Name: " + p1.name + ", Age: " + p1.age + ", Height: " + p1.height);
//        p1.study();

//        Person p2 = new Person("Mike", 25, 180);
//        p2.study();
//        System.out.println("Name: " + p2.name + ", Age: " + p2.age + ", Height: " + p2.height);
        Girl girl = new Girl(18);
        System.out.println("Age: " + girl.getAge());
        girl.setAge(20);
        System.out.println("Age: " + girl.getAge());

    }
}
