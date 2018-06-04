package com.blueberry.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Alman
 * @date 2018-06-03 11:38 AM
 */

public class MyTest27 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 可以省略
        Class.forName("com.mysql.jdbc.Driver");
        Connection alman = DriverManager.getConnection("jdbc:mysql://localhost:3306/cherry", "root", "root");

    }

}
