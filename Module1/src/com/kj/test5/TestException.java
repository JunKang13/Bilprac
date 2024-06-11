package com.kj.test5;

public class TestException {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 0;
        if (b == 0) {
//            try {
//                throw new Exception("Divide by zero");
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
            throw new Exception("Divide by zero");
        }
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        } finally {
            System.out.println("Finally block");
        }

    }
}
