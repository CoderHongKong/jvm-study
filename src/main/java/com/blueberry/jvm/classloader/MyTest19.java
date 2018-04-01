package com.blueberry.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * @author hekai
 * @create 2018-03-31 上午9:38
 */

public class MyTest19 {
    public static void main(String[] args) throws Exception{
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();


        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class);




    }

}
