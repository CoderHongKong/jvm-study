package com.blueberry.jvm.classloader;

/**
 * @author HEK(hk177955)
 * @date 2018-12-27 15:42
 */

public class TestSPIImpl extends TestSPI {

    static {
        System.out.println("-----TestSPIImpl static block---classloader--" + TestSPIImpl.class.getClassLoader());
    }

    public static void main(String[] args) throws Exception {
        TestSPIImpl testSPI = new TestSPIImpl();
        testSPI.run();
    }

    @Override
    public void say() throws Exception {
        System.out.println("----TestSPIImpl: say------");
    }

}
