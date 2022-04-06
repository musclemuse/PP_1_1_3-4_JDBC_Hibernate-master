package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "j0inMuse";
    private static final String URL = "jdbc:mysql://localhost:3306/kataTest";
    private static Connection CONNECTION;

    static {
        try {
            CONNECTION = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return CONNECTION;
    }

    // реализуйте настройку соеденения с БД
}
