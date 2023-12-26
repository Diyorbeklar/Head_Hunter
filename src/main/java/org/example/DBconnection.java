package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public static final String url = "jdbc:postgresql://localhost:5432/head_hunter";
    public static final String user = "postgres";
    public static final String password = "Diyor2412";

    public static Connection connection(){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
