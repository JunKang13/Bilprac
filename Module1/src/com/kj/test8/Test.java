package com.kj.test8;

public class Test {
    public static void main(String[] args) {
        // main 是主线程
        for (int i = 1; i <= 10; i++) {
            System.out.println("主线程输出1：" + i);
        }

        TestThread testThread = new TestThread();
        testThread.start(); // 启动子线程
        // 一旦启动子线程，主线程和子线程就是并发执行的, 会争抢资源 CPU 的执行权
        for (int i = 11; i <= 200; i++) {
            System.out.println("主线程输出2：" + i);
        }
        // 主线程和子线程是并发执行的，谁抢到资源就执行谁, 所以主线程和子线程的输出顺序是不确定的, 可能先执行子线程，再执行主线程，也可能先执行主线程，再执行子线程
    }
}
