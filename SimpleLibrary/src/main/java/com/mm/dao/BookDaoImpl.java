package com.mm.dao;

import com.mm.connector.MysqlConnector;
import com.mm.entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by machu on 2017-04-22.
 */
public class BookDaoImpl implements BookDao {

    private MysqlConnector mysqlConnector = MysqlConnector.getInstance();


    public void add(Book book) throws SQLException {
        Connection connection = mysqlConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Books(author, title) values (?, ?)");
        preparedStatement.setString(1, book.getAuthor());
        preparedStatement.setString(2, book.getTitle());
        preparedStatement.executeUpdate();
    }


    public List<Book> getBooks() throws SQLException {
        Connection connection = mysqlConnector.getConnection();
        ResultSet result = null;
        PreparedStatement preparedStatement =
                connection.prepareStatement("select * from Books");
        result = preparedStatement.executeQuery();

        List<Book> list = new LinkedList<Book>();
        if (result == null) {
            return list;
        }
        while (result.next()) {
            Book book = new Book(result.getInt("id"),
                    result.getString("title"),
                    result.getString("author")
            );
            list.add(book);
        }
        return list;

    }
}
