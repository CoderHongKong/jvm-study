package com.blueberry.jvm.gc;

/**
 * -verbose:gc 输出gc详细信息
 * -Xms20M 堆空间初始大小
 * -Xmx20M 堆空间最大小
 * -Xmn10M 堆空间新生代大小
 * -XX:+printGCDetails 打印gc详细信息
 * <p>
 * <p>
 * -verbosegc
 * -Xms20M
 * -Xmx20M
 * -Xmn10M
 * -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 * -XX:+UseConcMarkSweepGC
 * <p>
 * <p>
 * <p>
 * <p>
 * jdk1.8默认收集器
 * PSYoungGen: Parallel Scavenge （新生代垃圾收集器）
 * <p>
 * ParOldGen: Parallel old （老年代垃圾收集器）
 *
 * @author tengyue(hk177955)
 * @date 2019-12-02 5:25 PM
 */

public class MyTest5 {


    public static void main(String[] args) throws InterruptedException {
        int size = 1024 * 1024;

        byte[] bytes1 = new byte[4 * size];
        System.out.println("111");
        byte[] bytes2 = new byte[4 * size];
        System.out.println("222");
        byte[] bytes3 = new byte[2 * size];
        System.out.println("333");
        byte[] bytes4 = new byte[2 * size];


        System.out.println("hello word");
    }
}
