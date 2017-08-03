package com.mm.dao;

        import com.mm.connector.MysqlConnector;
        import com.mm.entity.Customer;

        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;

/**
 * Created by machu on 2017-04-23.
 */
public class CustomerDaoImpl implements CustomerDao {

    private MysqlConnector mysqlConnector = MysqlConnector.getInstance();
    ;

    @Override
    public void add(Customer customer) throws SQLException {
        Connection connection = mysqlConnector.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("insert into Customers(name, surname) values (?, ?)");
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getSurname());
        preparedStatement.executeUpdate();
    }

    @Override
    public void edit(Customer customer) throws SQLException {
        Connection connection = mysqlConnector.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("update Customers set name=?, surname=?" +
                        " where id = ?");
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getSurname());
        preparedStatement.setInt(3, customer.getPrimaryKey());

        preparedStatement.executeUpdate();
    }
}
