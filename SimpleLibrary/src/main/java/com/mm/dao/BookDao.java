package com.mm.dao;

import com.mm.entity.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by machu on 2017-04-22.
 */
public interface BookDao {
    public void add(Book book) throws SQLException;
    List<Book> getBooks() throws SQLException;


}
