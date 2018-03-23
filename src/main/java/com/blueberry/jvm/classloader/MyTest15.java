package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-15 下午4:12
 */

public class MyTest15 {

    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());

        System.out.println("-------------");
        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());

        System.out.println("-------------");
        MyTest15[] MyTest15s = new MyTest15[2];
        System.out.println(MyTest15s.getClass().getClassLoader());
    }

}
