package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Util instance;
    private static Connection connection;

    private static final String USERNAME = "root";
    private static final String PASSWORD = "j0inMuse";
    private static final String URL = "jdbc:mysql://localhost:3306/kataTest";

    private Util() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public static Connection getConnection() {
        return connection;
    }

    // реализуйте настройку соеденения с БД
}
