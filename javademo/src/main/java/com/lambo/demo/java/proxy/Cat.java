package com.lambo.demo.java.proxy;

/**
 * @author rambo yang
 */
public class Cat implements Animal {

    @Override
    public void action() {
        System.out.println("喵喵喵~~~~");
    }

    @Override
    public void breath() {
        System.out.println("猫式呼吸法~~~~");
    }
}
