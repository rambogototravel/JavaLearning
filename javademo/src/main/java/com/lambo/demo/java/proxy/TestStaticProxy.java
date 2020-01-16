package com.lambo.demo.java.proxy;

/**
 * @author rambo yang
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        Animal catProxy = new CatProxy(new Cat());

        catProxy.action();
    }
}
