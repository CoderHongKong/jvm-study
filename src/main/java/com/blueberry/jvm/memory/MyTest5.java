package com.blueberry.jvm.memory;

/**
 *
 * jmap
 * jstat
 *
 * @author tengyue(hk177955)
 * @date 2019-04-03 14:14
 */

public class MyTest5 {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(50000);
            System.out.println("hello word");
        }
    }
}
