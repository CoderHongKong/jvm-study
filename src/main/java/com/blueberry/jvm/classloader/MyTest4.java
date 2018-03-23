package com.blueberry.jvm.classloader;

/**
 * 对于数组实例来说，其类型是由jvm在运行期动态生成的，表示为：[Lcom.blueberry.jvm.classloader.Parent4;
 * 这种形式其父类是java.lang.Object
 * 对于数组来说，JavaDoc经常将构成数组的元素为Component，实际上就是将数组降低一个维度后的类型。
 *
 * 助记符：
 *  anewarray：表示创建一个引用类型的（类、接口、数组）数组，并将其引用值压入栈顶
 *  newarray：表示创建一个原生类型的（int、float、char等）数组，并将其引用值压入栈顶
 *
 * @author hekai
 * @create 2018-02-22-18:00
 */
public class MyTest4 {

    public static void main(String[] args) {
        // 主动使用
        Parent4 parent4 = new Parent4();
        System.out.println("============");
        Parent4 parent41 = new Parent4();
        // 非主动使用
        Parent4[] parent4s = new Parent4[1];
        System.out.println(parent4s.getClass());

        System.out.println("====");
        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

    }
}

class Parent4 {
    static {
        System.out.println("parent4 static block");
    }
}
