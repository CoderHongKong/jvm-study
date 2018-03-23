package com.blueberry.jvm.classloader;

/**
 * 当一个接口在初始化时，并不要求其父接口都完成了初始化
 *  只有在真正使用到父接口的时候（）
 *
 * @author hekai
 * @create 2018-02-22-19:54
 */
public class MyTest5 {
    public static void main(String[] args) {
//        System.out.println(Child.b);
        new C();
        new C();
    }
}

class Grandpa{
    public static Thread thread = new Thread(){
        {
            System.out.println("Grandpa invoked");
        }
    };
}

interface Parent5 {

    public static int a = 5;

    public static Thread thread = new Thread(){
        {
            System.out.println("parent5 invoked");
        }
    };
}

interface Child extends Parent5 {
    public static int b = 6;
}

interface Grandpa1{
    public static Thread thread = new Thread(){
        {
            System.out.println("Grandpa invoked");
        }
    };
}

interface Parent5_1 extends Grandpa1{
    public static Thread thread = new Thread(){
        {
            System.out.println("Grandpa invoked");
        }
    };
}


class C{
    {
        System.out.println("hello");
    }

    public C(){
        System.out.println("C");
    }
}