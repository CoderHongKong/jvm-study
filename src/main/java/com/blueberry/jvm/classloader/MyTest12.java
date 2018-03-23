package com.blueberry.jvm.classloader;

/**
 * 调用classLoader.loadClass加载一个类，并不是对类的主动使用，不会导致类的初始化
 *
 * @author hekai
 * @create 2018-03-03-16:15
 */
public class MyTest12 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = classLoader.loadClass("com.blueberry.jvm.classloader.Cl");
        System.out.println(clazz);
        System.out.println("-------------------");
        clazz = Class.forName("com.blueberry.jvm.classloader.Cl");
        System.out.println(clazz);
    }
}


class Cl {
    static {
        System.out.println("cl static block");
    }
}