package com.kj.test2;

public class TestLoop {
    public static void main(String[] args) {
        // sum out all the numbers
        int num1 = 1;
        int num2 = 10;
        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("The sum of all the numbers between " + num1 + " and " + num2 + " is " + sum);


        sum = 0;
        while (num1 <= num2) {
            sum += num1;
            num1++;
        }

        System.out.println("The sum of all the numbers between " + 1 + " and " + num2 + " is " + sum);
    }
}
