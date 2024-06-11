package com.kj.test2;

public class TestFunc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void add3(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(3, 4));
        System.out.println(add(5, 6));

        // 调用add3方法，传入三个参数
        add3(1, 2, 3);
    }
}
