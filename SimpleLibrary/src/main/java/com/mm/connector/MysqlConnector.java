package com.mm.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by machu on 2017-04-22.
 */
public class MysqlConnector {
    private Connection connection = null;
    private Statement statement = null;
    private static MysqlConnector mysqlConnector = null;

    private MysqlConnector() {
        connect();


    }

    public static MysqlConnector getInstance() {
        if (mysqlConnector == null) {
            mysqlConnector = new MysqlConnector();
        }
        return mysqlConnector;
    }

    private void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4?" +
                    "user=root&password=qmachu231");
            statement = connection.createStatement();
            System.out.println("Application has been connected to the database ^^ ");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
