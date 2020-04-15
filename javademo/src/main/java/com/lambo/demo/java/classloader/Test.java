package com.lambo.demo.java.classloader;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.util.Objects;

/**
 * @author rambo yang
 */
public class Test {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        System.out.println("引导类加载器加载路径：" + System.getProperty("sun.boot.class.path"));
//        System.out.println("扩展类加载器加载路径：" + System.getProperty("java.ext.dirs"));
//        System.out.println("系统类加载器加载路径：" + System.getProperty("java.class.path"));

        ClassLoader myLoader = new ClassLoader() {
            @SneakyThrows
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {

                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";

                InputStream is = getClass().getResourceAsStream(fileName);
                if (Objects.isNull(is)) {
                    return super.loadClass(name);
                }
                byte[] b = new byte[is.available()];
                is.read(b);
                return defineClass(name, b, 0, b.length);
            }
        };

        System.out.println("Test的默认类加载器：" + Test.class.getClassLoader().toString());

        Object obj = myLoader.loadClass("com.lambo.demo.java.classloader.Test").newInstance();
        System.out.println(obj.getClass());
        System.out.println("obj的类加载器：" + obj.getClass().getClassLoader().toString());

        System.out.println(obj instanceof Test);

//        Object obj1 = Test.class.getClassLoader().getParent().loadClass("com.lambo.demo.java.classloader.Test").newInstance();
//        System.out.println(obj1.getClass());
    }


    class Person {

        private String name;

        @Override
        public String toString() {
            return this.name;
        }
    }
}
