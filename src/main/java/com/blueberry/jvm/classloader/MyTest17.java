package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-31 上午9:38
 */

public class MyTest17 {
    public static void main(String[] args) throws Exception{
        MyTest16 loader1 = new MyTest16("loader1");
        Class<?> clazz = loader1.loadClass("com.blueberry.jvm.classloader.MySample");

        System.out.println("clazz: " + clazz.hashCode());

        // 注释掉该行则不会初始化mysample对象，即mysample对象的构造方法不会被调用
        // 因此不会实例化mycat对象，即没有对mycat主动使用，不会加载Mycat class
//        Object o = clazz.newInstance();


    }

}
