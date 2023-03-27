package com.ljt.practice.proxy;

import com.ljt.practice.dynamicProxy.Animal;
import com.ljt.practice.dynamicProxy.Cat;
import com.ljt.practice.dynamicProxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
//        LiuYiFei liuYiFei = new LiuYiFei();
//        ProxyTest proxyTest = new ProxyTest(liuYiFei);
//        proxyTest.findMv();
        Animal cat = new Cat();
        InvocationHandler dynamicProxy = new DynamicProxy(cat);
        Animal o = (Animal) Proxy.newProxyInstance(cat.getClass().getClassLoader(), cat.getClass().getInterfaces(), dynamicProxy);
        o.eat();
    }
}
