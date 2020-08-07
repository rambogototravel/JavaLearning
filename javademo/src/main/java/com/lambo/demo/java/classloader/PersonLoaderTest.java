package com.lambo.demo.java.classloader;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;

/**
 * @author ramboy
 */
public class PersonLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

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

//        Person student = new Student();
//
//        System.out.println("Student的默认类加载器：" + student.getClass().getClassLoader().toString());
//        System.out.println(student instanceof Person);
//        System.out.println(student.getClass().isAssignableFrom(Student.class));
//
//        Class p = student.getClass().getClassLoader().loadClass("com.lambo.demo.java.classloader.Person");
//        System.out.println(p.getClassLoader().toString());
//        System.out.println(p.getClass());
//        System.out.println(p.isAssignableFrom(Person.class));

//        Object teacher = myLoader.loadClass("com.lambo.demo.java.classloader.Teacher").newInstance();
//        Object teacher = Thread.currentThread().getContextClassLoader().loadClass("com.lambo.demo.java.classloader.Teacher").newInstance();
//        System.out.println(teacher.getClass());
//        System.out.println("Teacher的类加载器：" + teacher.getClass().getClassLoader().toString());
//        System.out.println(teacher instanceof Person);
//        System.out.println(Person.class.getClassLoader());
//        System.out.println((Person)teacher);

//        System.out.println(Driver.class.getClassLoader());
//
//        System.out.println(com.mysql.cj.jdbc.Driver.class.getClassLoader());
//        ServiceLoader<Driver> loadedDrivers = ServiceLoader.load(Driver.class);
//        Iterator<Driver> driversIterator = loadedDrivers.iterator();
//        try{
//            while(driversIterator.hasNext()) {
//                Driver d = driversIterator.next();
//                System.out.println(d.getClass());
//                System.out.println(d.getClass().getClassLoader());
//                System.out.println(d instanceof Driver);
//                System.out.println(d.getClass().isAssignableFrom(com.mysql.cj.jdbc.Driver.class));
//            }
//        } catch(Throwable t) {
//            // Do nothing
//        }
//
//        System.out.println(com.mysql.cj.jdbc.Driver.class.getClassLoader());
//        System.out.println(Driver.class.getClassLoader());

        Class a = Class.forName("java.sql.Driver");
        Driver d = (Driver)a.newInstance();
    }
}
