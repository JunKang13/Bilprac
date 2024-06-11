package com.kj.test1;

public class TestVar {
    public static void main(String[] args) {
        int age;
        age = 22;
        System.out.println("My age is " + age);
        String name = "KJ";
        char sex = 'M';
        System.out.println("My name is " + name + " and my sex is " + sex + ".");
        TestVar testVar = new TestVar();
        System.out.println("The sum of 3 and 5 is " + testVar.add(3, 5) + ".");
    }

    public int add(int a, int b) {
        return a + b;
    }
}