package com.blueberry.jvm.gc;

/**
 * -verbose:gc 输出gc详细信息
 * -Xms20M 堆空间初始大小
 * -Xmx20M 堆空间最大小
 * -Xmn10M 堆空间新生代大小
 * -XX:+printGCDetails 打印gc详细信息
 * -XX:SurvivorRatio=8 eden和survivor比例
 * -XX:PretenureSizeThreshold=88   单位:字节，表示创建的对象大于该值时，就不在新生代创建该对象，直接在老年代分配，需要使用 -XX:+UseSerialGC
 *
 * jdk1.8默认收集器
 * PSYoungGen: Parallel Scavenge （新生代垃圾收集器）
 *
 * ParOldGen: Parallel old （老年代垃圾收集器）
 *
 * @author tengyue(hk177955)
 * @date 2019-10-2019/10/26 5:25 PM
 */

public class MyTest2 {


    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] bytes1 = new byte[5 * size];
//        byte[] bytes2 = new byte[2 * size];
//        byte[] bytes3 = new byte[3 * size];
//        byte[] bytes4 = new byte[3 * size];

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
