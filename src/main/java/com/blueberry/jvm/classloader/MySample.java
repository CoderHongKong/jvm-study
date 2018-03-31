package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-03-31 上午9:37
 */

public class MySample {

    public MySample(){
        System.out.println("MySample is loaded by: " + this.getClass().getClassLoader());
        new MyCat();
    }
}
