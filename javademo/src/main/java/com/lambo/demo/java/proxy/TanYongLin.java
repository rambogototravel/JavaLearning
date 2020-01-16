package com.lambo.demo.java.proxy;

/**
 * @author rambo yang
 */
public class TanYongLin implements Star {

    @Override
    public String sing(String name) {
        System.out.println("笑看人生");
        return "唱完";
    }

    @Override
    public String dance(String name) {
        System.out.println("梦伴");
        return "跳完";
    }
}
