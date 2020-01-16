package com.lambo.demo.java.proxy;

/**
 * @author rambo yang
 */
public class CatProxy implements Animal {

    private Animal target;

    public CatProxy(Animal target) {
        this.target = target;
    }

    @Override
    public void action() {
        System.out.println("==========CatProxy 代理类执行开始！=============");
        //实质上在代理类中是调用了被代理实现接口的方法
        target.action();
        System.out.println("==========CatProxy 代理类执行结束！===========");
    }

    @Override
    public void breath() {
        System.out.println("==========DogProxy 代理类执行开始！=============");
        target.breath();
        System.out.println("==========DogProxy 代理类执行结束！===========");
    }
}
