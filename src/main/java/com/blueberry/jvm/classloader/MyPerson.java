package com.blueberry.jvm.classloader;

/**
 * @author hekai
 * @create 2018-04-01 下午10:19
 */

public class MyPerson {
    private MyPerson person;

    public void set(Object object) {
        this.person = (MyPerson) object;
    }

}
