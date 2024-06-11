package com.kj.test8;

public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("字线程输出：" + i);
        }
    }
}
