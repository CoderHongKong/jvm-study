package com.blueberry.jvm.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * 方法区内存溢出jconsole
 * -XX:MaxMetaspaceSize=10m
 *
 * @author tengyue(hk177955)
 * @date 2019-04-03 14:14
 */

public class MyTest4 {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MyTest4.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (obj, method, param, proxy) -> proxy.invokeSuper(obj, param));
            System.out.println("hello word");
            enhancer.create();
            Thread.sleep(300);
        }
    }
}
