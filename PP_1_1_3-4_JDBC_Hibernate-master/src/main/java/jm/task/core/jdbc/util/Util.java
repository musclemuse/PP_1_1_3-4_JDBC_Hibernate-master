package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String userName = "root";
    private static final String password = "j0inMuse";
    private static final String connectionURL = "jdbc:mysql://localhost:3306/kataTest";
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(connectionURL, userName, password);
//          System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    // реализуйте настройку соеденения с БД
}
