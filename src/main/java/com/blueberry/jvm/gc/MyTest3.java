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
 * -XX: +PrintCommandLineFlags
 * -XX: +SurvivorRatio=8
 * -XX: MaxTenuringThreshold=5 在可以自动调节对晋升(promote)到老年代阈值的gc中，设置该阈值的最大值。
 * 该参数默认值为15，CMS中默认值为6，G1默认值为15（在jvm中，该数值由4个bit表示的，所以最大值：1111，即15）
 *
 * 经历了多次gc后,存活的对象会在 From survivor与 To Survivor之间来回存放,而这里面的一个前提则是这两个空间有足够的大小来存放这些数据,在Gc算法中
 * 会计算每个对象年龄的大小,如果达到某个年龄后发现占用空间总大小已经大于了 （from/to）Survivor空间的50%,那么这时就需要调整阈值,不能再继续等到默认的15次GC后才完成晋升
 * 因为这样会导致 Survivor空间不足,所以需要调整阈值,让这些存活对象尽快完成晋升。
 *
 * -XX: +PrintTenuringDistribution
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

public class MyTest3 {


    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] bytes1 = new byte[2 * size];
        byte[] bytes2 = new byte[2 * size];
        byte[] bytes3 = new byte[2 * size];
        byte[] bytes4 = new byte[2 * size];


    }
}
