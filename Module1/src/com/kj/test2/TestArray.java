package com.kj.test2;

public class TestArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 输出数组元素
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
