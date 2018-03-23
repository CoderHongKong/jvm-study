package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-03-14:48
 */
public class MyTest9 {

    static {
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) {
        System.out.println(Child9.b);
    }
}

class Parent9{

    static int a = 3;

    static {
        System.out.println("Parent static block");
    }
}

class Child9 extends Parent9{

    static int b = 4;

    static {
        System.out.println("Child static block");
    }


}
