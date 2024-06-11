package com.kj.test1;

public class TestOperands {
    public static void main(String[] args) {
        // arithmetic operators
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        // if print numbers after string, the numbers will be treated as string
        // else, the numbers will be treated as numbers
        System.out.println(5 + 6 + " != " + 5 + 6);

        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);

        int c = a++ + 7;
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        int sum = 0;
        sum += a + b;
        System.out.println("sum = " + sum);

        // relational operators
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));

        // logical operators
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + !x);

        // bitwise operators

    }
}
