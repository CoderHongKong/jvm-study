package com.blueberry.jvm.classloader;

/**
 * @author HEK(hk177955)
 * @date 2018-12-27 15:38
 */

public class TestSPI {

    static {
        try {
            System.out.println("TestSpiloaded:" + TestSPI.class.getClassLoader());
            TestSPI testSPI = new TestSPIImpl();
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println("contextClassLoader:" + contextClassLoader);
//            Class<?> clazz = contextClassLoader.loadClass("com.blueberry.jvm.classloader.TestSPIImpl");
            Class<?> clazz = Class.forName("com.blueberry.jvm.classloader.TestSPIImpl", true, contextClassLoader);            Object o = clazz.newInstance();
            System.out.println(o + ":****:" + o.hashCode());

            System.out.println((TestSPIImpl)o);

            testSPI.say();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void say() throws Exception {
        throw new Exception("please over wirte this method!");
    }

    public void run() throws Exception {
        say();
    }


}
