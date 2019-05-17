package com.station.persistent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Database() {}

    private static class LazyHolder {
        // move to properties file
        private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bus_station_db";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        static {
            Connection tmp = null;
            try {
                Class.forName(JDBC_DRIVER);
                tmp = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DB_CONNECTION = tmp;
        }

        private static final Connection DB_CONNECTION;
    }

    public static Connection getConnection() {
        return LazyHolder.DB_CONNECTION;
    }
}
