package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-31 上午9:38
 */

public class MyTest18_1 {
    public static void main(String[] args) throws Exception{
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("/Users/hekai/Desktop/");
        Class<?> clazz = loader1.loadClass("com.blueberry.jvm.classloader.MyTest1");

        System.out.println("clazz: " + clazz.hashCode());
        System.out.println("clazz loader : " + clazz.getClassLoader() );




    }

}
