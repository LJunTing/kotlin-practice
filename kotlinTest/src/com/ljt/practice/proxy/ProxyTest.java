package com.ljt.practice.proxy;

public class ProxyTest implements Jingji {

    private LiuYiFei liuYiFei;

    public ProxyTest(LiuYiFei liuYiFei) {
        this.liuYiFei = liuYiFei;
    }

    @Override
    public void findMv() {
        liuYiFei.findMv();
    }
}
