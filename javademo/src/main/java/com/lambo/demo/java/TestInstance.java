package com.lambo.demo.java;

/**
 * @author rambo yang
 */
public class TestInstance {

    public static void main(String[] args) {

        new Son("Hello");
    }

    static class Father {

        public Father() {
            System.out.println("Father");
        }
    }

    static class Son extends Father {

        private String name;

        public Son() {
            System.out.println("Son");
        }

        public Son(String name) {
            this.name = name;
        }
    }
}
