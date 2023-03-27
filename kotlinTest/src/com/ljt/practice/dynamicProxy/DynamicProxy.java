package com.ljt.practice.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object animal;

    public DynamicProxy(Object animal) {
        this.animal = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Class<?> aClass = proxy.getClass();
//        Object o = aClass.newInstance();
//        Method eat = aClass.getMethod("eat");
//        eat.setAccessible(true);
//        eat.invoke(proxy);
        method.invoke(animal, args);
        return null;
    }
}
