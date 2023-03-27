package com.ljt.practice.com;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingTest {

    static SingTest getinstance() {
        return Holder.instance;
    }

    static class Holder {
        private final static SingTest instance = new SingTest();
    }

    public static void main(String[] args) {
        SingTest getinstance = SingTest.getinstance();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,3,5000, TimeUnit.SECONDS,new SynchronousQueue<>());
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"---"+SingTest.getinstance());
        });
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"---"+SingTest.getinstance());
        });
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"---"+SingTest.getinstance());
        });
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"---"+SingTest.getinstance());
        });
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"---"+SingTest.getinstance());
        });
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"---"+SingTest.getinstance());
        });
        executor.shutdown();
    }

}
