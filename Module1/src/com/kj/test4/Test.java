package com.kj.test4;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(20);
        s.setHeight(5.8);
        s.setUid(1234);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getUid());
        s.eat();
        s.sleep();
        s.shout();
        s.study();
    }

}
