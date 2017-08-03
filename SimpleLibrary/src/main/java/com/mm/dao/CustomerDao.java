package com.mm.dao;

import com.mm.entity.Customer;

import java.sql.SQLException;

/**
 * Created by machu on 2017-04-23.
 */
public interface CustomerDao {

    void add(Customer customer) throws SQLException;
    void edit(Customer customer) throws SQLException;



}
