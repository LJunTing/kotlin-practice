package com.ljt.practice.dynamicProxy;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃饭");
    }
}
