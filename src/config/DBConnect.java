/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hangnt
 */
public class DBConnect {
    public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "DUAN1";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "12";

    /**
     * Get connection to MSSQL Server
     *
     * @return Connection
     */
    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME +";encrypt=true;trustServerCertificate=true;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }

    
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn;
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME +";encrypt=true;trustServerCertificate=true;";
        conn = DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

     public static int executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement stmt = DBConnect.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
     public static ResultSet executeQuery(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = DBConnect.getStmt(sql, args);
        return stmt.executeQuery();
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = DBConnect.executeQuery(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
