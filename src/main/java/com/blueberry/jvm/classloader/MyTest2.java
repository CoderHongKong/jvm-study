package com.blueberry.jvm.classloader;

/**
 * 常量在编译阶段会存入到调用这个常量的方法所在的类的常量池中
 * 本质上，调用类并没有直接引用到定义常量的类，因此不会触发定义常量的类初始化
 * 注意：这里指的是将常量存放到MyTest2的常量池中，之后MyTest2与Parent就没有任何关系
 * 再者，可以删除Parent2.class文件
 *
 * 助记符：
 *  ldc:表示将int、float、String的类型的常量值从常量池中推送至栈顶
 *  bipush:表示将单字节-128~127的常量值推送至栈顶
 *  sipush:表示将短整型-32768~32767的常量值推送至栈顶
 *  iconst_1表示将int类型1推送至栈顶（iconst_m1~inconst_5）
 *
 * @author hekai
 * @create 2018-02-21-20:09
 */
public class MyTest2 {

    public static void main(String[] args) {
        System.out.println(Parent2.str);
        System.out.println(Parent2.s);
        System.out.println(Parent2.i);
        System.out.println(Parent2.iconst);
    }

}

class Parent2{
    public static final String str = "hello";

    public static final short s = 7;

    public static final int i = 200;

    public static final int iconst = 2;

    static{
        System.out.println("parent2 static block");
    }
}