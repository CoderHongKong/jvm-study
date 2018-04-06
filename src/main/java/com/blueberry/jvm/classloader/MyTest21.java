package com.blueberry.jvm.classloader;

import java.lang.reflect.Method;

/**
 * @author hekai
 * @create 2018-03-31 上午9:38
 */

public class MyTest21 {
    public static void main(String[] args) throws Exception{
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");

        loader1.setPath("/Users/hekai/Desktop/");
        loader2.setPath("/Users/hekai/Desktop/");

        Class<?> clazz = loader1.loadClass("com.blueberry.jvm.classloader.MyPerson");
        Class<?> clazz2 = loader1.loadClass("com.blueberry.jvm.classloader.MyPerson");

        System.out.println(clazz == clazz2);

        Object o = clazz.newInstance();
        Object o2 = clazz2.newInstance();

        Method method = clazz.getMethod("set", Object.class);
        method.invoke(o, o2);


    }

}
