package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-31 上午9:38
 */

public class MyTest18 {
    public static void main(String[] args) throws Exception{
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));


    }

}
