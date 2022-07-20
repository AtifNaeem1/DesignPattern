package com.ObjectPool;

import java.sql.Connection;

public class Main {
    public static void main(String args[])
    {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/8080",
                "atifnaeem", "xxxxxxx");

        // Get a connection:
        Connection connection = pool.takeOut();
        // Return the connection:
        pool.takeIn(connection);
    }
}
