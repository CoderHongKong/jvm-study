package com.blueberry.jvm.gc;

/**
 * -verbose:gc 输出gc详细信息
 * -Xms20M 堆空间初始大小
 * -Xmx20M 堆空间最大小
 * -Xmn10M 堆空间新生代大小
 * -XX:+printGCDetails 打印gc详细信息
 * -XX:SurvivorRatio=8 eden和survivor比例
 *
 * @author tengyue(hk177955)
 * @date 2019-10-2019/10/26 5:25 PM
 */

public class MyTest1 {


    public static void main(String[] args) {
        int size = 1024 * 1024 * 7;

        byte[] bytes1 = new byte[1 * size];
        byte[] bytes2 = new byte[1 * size];
//        byte[] bytes3 = new byte[1 * size];
//        byte[] bytes4 = new byte[1 * size];
//        byte[] bytes5 = new byte[1 * size];
//        byte[] bytes6 = new byte[1 * size];
//        byte[] bytes7 = new byte[1 * size];

        System.out.println("hello word");

    }
}
