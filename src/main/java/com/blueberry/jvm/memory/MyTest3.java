package com.blueberry.jvm.memory;

/**
 * 死锁测试 jconsole
 *
 * @author tengyue(hk177955)
 * @date 2019-04-03 11:51
 */

public class MyTest3 {

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> A.fun()).start();
        new Thread(() -> B.fun()).start();
        Thread.sleep(500000);
    }

}

class A{

     static synchronized void fun(){
        System.out.println("com.blueberry.jvm.memory.A.fun");
        try {
            Thread.sleep(5000);
            B.fun();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class B{

    static synchronized void fun(){
        System.out.println("com.blueberry.jvm.memory.B.fun");
        try {
            Thread.sleep(5000);
            A.fun();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
