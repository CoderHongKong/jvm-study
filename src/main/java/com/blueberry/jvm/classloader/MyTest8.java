package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-03-13:29
 */
public class MyTest8 {

    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}


class FinalTest{
    public static final int x = 3;
    static {
        System.out.println("FinalTest static block");
    }
}