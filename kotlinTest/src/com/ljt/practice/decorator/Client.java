package com.ljt.practice.decorator;

import com.ljt.practice.dynamicProxy.Animal;
import com.ljt.practice.dynamicProxy.Cat;
import com.ljt.practice.dynamicProxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
//        Component component = new ConcreteComponent();
//        //第一次修饰
//        component = new ConcreteDecoratorA(component);
//        //第二次修饰
//        component = new ConcreteDecoratorB(component);
//        //修饰后运行
//        component.operation();

        Animal cat = new Cat();
        DynamicProxy dynamicProxy = new DynamicProxy(cat);
        Animal o = (Animal) Proxy.newProxyInstance(cat.getClass().getClassLoader(), cat.getClass().getInterfaces(), dynamicProxy);
        o.eat();
    }

}