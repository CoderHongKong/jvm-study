package com.blueberry.jvm.classloader;

import lombok.Setter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author hekai
 * @create 2018-03-15 下午7:37
 */

public class MyTest16 extends ClassLoader {

    private String classLoaderName;
    @Setter
    private String path;

    private static final String fileExtension = ".class";

    public MyTest16(String classLoaderName) {
        super(); // 将系统类加载器作为该类的默认类加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent); // 显示指定该类的默认加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    public String toString() {
        return "MyTest16{" +
                "classLoaderName='" + classLoaderName + '\'' +
                '}';
    }

    private byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        className = className.replace(".", "/");
        try {

            is = new FileInputStream(new File(this.path + className + fileExtension));
            baos = new ByteArrayOutputStream();
            int ch;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }


    @Override
    public Class findClass(String className) {
        System.out.println("--findClass name:" + className);
        System.out.println("--classloader name:" + this.classLoaderName);

        byte[] b = this.loadClassData(className);
        return defineClass(className, b, 0, b.length);
    }


    public MyTest16(ClassLoader parent){
        super(parent);
    }


    public static void test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = classLoader.loadClass("com.blueberry.jvm.classloader.MyTest1");
        Object o = clazz.newInstance();
        System.out.println(o);
    }



    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        // 加载

        MyTest16 loader1 = new MyTest16("loader1");
//        test(myTest16);
//        loader1.setPath("/Users/hekai/codespace/jvm-study/jvm-study/build/classes/");
        loader1.setPath("/Users/hekai/Desktop/");
        Class<?> clazz = loader1.loadClass("com.blueberry.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz.hashCode());
        Object o = clazz.newInstance();
        System.out.println(o);

        System.out.println("------------");

        MyTest16 loader2 = new MyTest16(loader1,"loader1");
//        test(myTest16);
//        loader1.setPath("/Users/hekai/codespace/jvm-study/jvm-study/build/classes/");
        loader2.setPath("/Users/hekai/Desktop/");
        Class<?> clazz2 = loader2.loadClass("com.blueberry.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz2.hashCode());
        Object o2 = clazz2.newInstance();
        System.out.println(o2);

        System.gc();
        
        System.out.println("------------");

        MyTest16 loader3 = new MyTest16(loader2, "loader3");
//        test(myTest16);
//        loader1.setPath("/Users/hekai/codespace/jvm-study/jvm-study/build/classes/");
        loader3.setPath("/Users/hekai/Desktop/");
        Class<?> clazz3 = loader3.loadClass("com.blueberry.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz3.hashCode());
        Object o3 = clazz3.newInstance();
        System.out.println(o3);




        // 卸载




    }
}




























