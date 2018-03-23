package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-03-16:03
 */
public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(Child11.a);
        Child11.doSomething();
    }
}

class Parent11{
    static int a = 3;
    static {
        System.out.println("Parent11 static block");
    }
    static void doSomething(){
        System.out.println("do something");
    }
}

class Child11 extends Parent11{
    static {
        System.out.println("Child11 static block");
    }
}
