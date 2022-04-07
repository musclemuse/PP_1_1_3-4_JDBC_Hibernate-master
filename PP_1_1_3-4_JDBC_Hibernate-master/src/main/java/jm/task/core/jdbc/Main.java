package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDao user = new UserDaoJDBCImpl();
        user.createUsersTable();
        user.saveUser("Ivan", "Black", (byte) 32);
        user.saveUser("Old", "Man", (byte) 90);
        user.saveUser("Mark", "Ivanovich", (byte) 1);
        user.saveUser("Ilona", "Konenko", (byte) 19);
        user.removeUserById(1);
        user.getAllUsers();


   //     user.cleanUsersTable();
      //  user.dropUsersTable();

        //Test
        //Test2
        //Test3
        //Test branches
        // реализуйте алгоритм здесь
    }
}
