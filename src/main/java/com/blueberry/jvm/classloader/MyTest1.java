package com.blueberry.jvm.classloader;

/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 * -XX:+TraceClassLoading,用于追踪类的加载信息并打印出来
 *
 * -XX:+<option> 表示开启option选项
 * -XX:-<option> 表示关闭option选项
 * -XX:<option>=<value> 表示将option选项的值设置为value
 *
 * @author hekai
 * @create 2018-02-19-20:50
 */
public class MyTest1 {

    public static void main(String[] args) {
        //对于静态字段来说，只有直接定义了该字段的类才会被初始化
//        System.out.println(Child1.str);
        //当一个类在初始化时，要求所有的父类全部已经初始化
        System.out.println(Child1.str2);

    }
}

class Parent1 {

    public static String str = "hello word!";

    static {
        System.out.println("Child1 Parent1 block");

    }
}

class Child1 extends Parent1 {

    public static String str2 = "welcome";

    static {
        System.out.println("Child1 static block");
    }
}