package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-03-11:48
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz1 = Class.forName("com.blueberry.jvm.classloader.A");
        System.out.println(clazz1.getClassLoader());
    }

}

class A{}
