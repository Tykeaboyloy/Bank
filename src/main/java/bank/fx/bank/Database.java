package bank.fx.bank;

import java.sql.*;

public class Database {
    static Connection con;

    public static void connect() throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bank_management", "root", "0603");
        }
    }

    public static ResultSet get(String sqlString) throws SQLException {
        connect();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sqlString);
        return rs;
    }
}