package com.kj.test2;

public class TestIter {
    public static void main(String[] args) {
        // see if a integer is bigger than 10
//        int num = 9;
//        if (num > 10) {
//            System.out.println("The number is bigger than 10");
//        } else {
//            System.out.println("The number is smaller than 10");
//        }

        // Grade a student's score, if score is bigger than 90, print "A", elseif score is bigger than 80, print "B", elseif score is bigger than 70, print "C", elseif score is bigger than 60, print "D", else print "F"

        int score = 85;

        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
