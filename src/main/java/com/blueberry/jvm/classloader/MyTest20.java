package com.blueberry.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

import java.lang.reflect.Method;

/**
 * @author hekai
 * @create 2018-03-31 上午9:38
 */

public class MyTest20 {
    public static void main(String[] args) throws Exception{
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");
        Class<?> clazz = loader1.loadClass("com.blueberry.jvm.classloader.MyPerson");
        Class<?> clazz2 = loader1.loadClass("com.blueberry.jvm.classloader.MyPerson");

        System.out.println(clazz == clazz2);

        Object o = clazz.newInstance();
        Object o2 = clazz2.newInstance();

        Method method = clazz.getMethod("set", Object.class);
        method.invoke(o, o2);


    }

}
