package com.blueberry.jvm.classloader;

import java.lang.reflect.Method;

/**
 * @author hekai
 * @create 2018-03-31 上午9:38
 */

public class MyTest22 {

    static{
        System.out.println("MyTest22 initialier");
    }
    public static void main(String[] args) throws Exception{
        System.out.println(MyTest22.class.getClassLoader());
        System.out.println(MyTest1.class.getClassLoader());


    }

}
