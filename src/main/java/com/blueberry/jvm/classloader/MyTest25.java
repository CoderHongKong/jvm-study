package com.blueberry.jvm.classloader;

/**
 * @author Alman
 * @date 2018-05-06 下午3:51
 */

public class MyTest25 implements Runnable {

    public Thread thread;

    public MyTest25(){
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader contextClassLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(contextClassLoader);
        System.out.println("Class: " + contextClassLoader);
        System.out.println("Parent: " + contextClassLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest25();
    }
}

