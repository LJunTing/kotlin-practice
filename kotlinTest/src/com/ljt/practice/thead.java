package com.ljt.practice;

import com.ljt.practice.com.SingTest;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class thead {
    public static void main(String[] args) {
        threadbean thead = new threadbean();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 5000, TimeUnit.SECONDS, new SynchronousQueue<>());
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "---" + thead.toString());
            thead.setName("线程: "+Thread.currentThread().getName() );
        });
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "---" + thead.toString());
            thead.setName("线程: "+Thread.currentThread().getName() );
        });
    }
}
