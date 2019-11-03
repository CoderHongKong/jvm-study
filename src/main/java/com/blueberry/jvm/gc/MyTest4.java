package com.blueberry.jvm.gc;

/**
 * -verbose:gc 输出gc详细信息
 * -Xms20M 堆空间初始大小
 * -Xmx20M 堆空间最大小
 * -Xmn10M 堆空间新生代大小
 * -XX:+printGCDetails 打印gc详细信息
 * -XX:SurvivorRatio=8 eden和survivor比例
 * -XX:MaxTenuringThreshold=5
 * -XX:+PrintTenuringDistribution
 *
 *
 * -verbose:gc
 * -Xmn50M
 * -Xmx200M
 * -XX:TargetSurvivorRatio=60
 * -XX:+PrintTenuringDistribution
 * -XX:+PrintGCDateStamps
 * -XX:+PrintGCDetails
 * -XX:+UseConcMarkSweepGC
 * -XX:+UseParNewGC
 * -XX:MaxTenuringThreshold=3
 *
 *
 *
 *
 * jdk1.8默认收集器
 * PSYoungGen: Parallel Scavenge （新生代垃圾收集器）
 *
 * ParOldGen: Parallel old （老年代垃圾收集器）
 *
 * @author tengyue(hk177955)
 * @date 2019-12-02 5:25 PM
 */

public class MyTest4 {


    public static void main(String[] args) throws InterruptedException {
        int size = 1024 * 1024;

        byte[] bytes = new byte[5 * 1024];
        byte[] bytes1 = new byte[5 * 1024];

        gc();
        Thread.sleep(1000);

        System.out.println("11111");

        gc();
        Thread.sleep(1000);

        System.out.println("2222");

        gc();
        Thread.sleep(1000);

        System.out.println("3333");

        gc();
        Thread.sleep(1000);
        System.out.println("4444");

        byte[] bytes2 = new byte[1024 * 1024];
        byte[] bytes3 = new byte[1024 * 1024];
        byte[] bytes4 = new byte[1024 * 1024];

        gc();
        Thread.sleep(1000);
        System.out.println("5555");

        gc();
        Thread.sleep(1000);
        System.out.println("6666");

        System.out.println("hello word");

    }

    private static void gc() {
        for (int i = 0; i < 40; i++){
            byte[] bytes = new byte[1024 * 1024];
        }
    }
}
