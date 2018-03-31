package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-31 上午9:37
 */

public class MyCat {

    public MyCat(){
        System.out.println("MyCat is loaded by:" + this.getClass().getClassLoader());
    }
}
