package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet users = DBManager.sendQuery(
            "SELECT * FROM `user`"
        );

        while (users.next()) {
            System.out.println("User #" + users.getString(1) + ": " + users.getString(2));
        }

        ResultSet test = DBManager.sendQuery(
            "SELECT `address` FROM `shipping_address` INNER JOIN user ON user.id= `shipping_address`.user_id WHERE user.username= 'Stéphanie'"
        );


        while (test.next()) {
            System.out.println("Marque #" + test.getInt(1) + ": " + test.getString(2));
        }

    }
}