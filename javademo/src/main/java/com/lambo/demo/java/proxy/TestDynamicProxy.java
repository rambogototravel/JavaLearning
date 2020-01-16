package com.lambo.demo.java.proxy;

/**
 * @author rambo yang
 */
public class TestDynamicProxy {

    public static void main(String[] args) {

        Star liuDeHua = new LiuDeHua();

        StarProxy starProxy = new StarProxy();
        starProxy.setTarget(liuDeHua);

        Object obj = starProxy.getProxy();

        Star liuDeHuaProxy = (Star) obj;
        liuDeHuaProxy.sing("刘德华");
        liuDeHuaProxy.dance("刘德华");

        System.out.println();

        Star tanYongLin = new TanYongLin();
        starProxy.setTarget(tanYongLin);

        Object obj1 = starProxy.getProxy();

        Star tanYongLinProxy = (Star) obj1;
        tanYongLinProxy.sing("谭咏麟");
        tanYongLinProxy.dance("谭咏麟");
    }
}
