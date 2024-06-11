package com.kj.test6;

import java.util.ArrayList;

public class TestSet {
    public static void main(String[] args) {
        // ArrayList
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");
        System.out.println(list);

        list.remove("World");
        System.out.println(list);

        list.set(1, "C++");
        System.out.println(list);

        list.get(2);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
