package com.kj.test1;
/**
 * @author kj
 * @version 1.0
 * This is a simple HelloWorld class
 * It prints out "I am a pig, oink oink oink!"
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("I am a pig, oink oink oink!");
        // use sayHello() method
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
