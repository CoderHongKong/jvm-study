package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-12 下午8:07
 */

public class MyTest13 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while(classLoader != null){
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }

}
