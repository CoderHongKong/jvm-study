package com.blueberry.jvm.memory;

/**
 * 虚拟机栈
 *
 * @author tengyue(hk177955)
 * @date 2019-04-02 18:02
 */

public class MyTest2 {

    private int length;

    public void test(){
        length++;
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test();
    }

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        try {
            myTest2.test();
        } catch (Throwable t){
            System.out.println(myTest2.length);
            t.printStackTrace();
        }
    }

}
