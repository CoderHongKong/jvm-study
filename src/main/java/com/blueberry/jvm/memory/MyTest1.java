package com.blueberry.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 虚拟机栈 stack frame 栈帧
 * 程序计数器（program counter）：
 * 本地方法栈：主要用于处理本地方法
 * 堆（heap）：jvm管理的最大一块内存空间，与堆相关的一个重要概念是垃圾收集器， 现在几乎所有的垃圾收集器都是基于分代收集算法，所有对空间也进一步分为新生代，老年代。
 *  Eden空间 from survivor空间 to survivor空间。
 * 方法区（Method Area）：存储元信息。永久代（permanent generation），jdk1.8已经废弃永久代，使用元空间metaspace
 * 运行时常量池：方法区的一部分
 * 直接内存：direct memory，与java nio密切相关的，jvm通过directbytebuffer来操作直接内存。
 *
 *  java对象创建过程：
 *  1、在堆内存中创建对象实例
 *  2、为对象的实例变量
 *
 * 指针碰撞（前提是堆中的空间通过一个指针进行分割，一侧是已被占用的空间，另一侧是未被占用的空间）
 * 空闲列表（前提是堆内存空间中已被使用与未被使用的空间是交织在一起的，这时，虚拟机就要通过一个列表来记录哪些空间是可以使用的，哪些空间是已被使用的，
 * 接下来找出可以容纳下新创建对象的且未被使用的空间，在此空间上存放该对象，同时还要修改列表上的记录）
 *
 * 对象在内存中的布局：
 * 1、对象头；
 * 2、实例数据（即在类中声明的各项信息）
 * 3、对齐填充（可选）
 *
 * 引用访问对象的两种方式：
 * 1、使用句柄的方式
 * 2、使用直接指针的方式
 *
 * -Xms5m
 * -Xmx5m
 * -XX:+HeapDumpOnOutMemoryError
 *
 * @author hekai
 * @date 2019-03-11 15:52
 */

public class MyTest1 {
    public static void main(String[] args) {
        List<MyTest1> list = new ArrayList<>();
        while (true){
            list.add(new MyTest1());
        }
    }

}





















