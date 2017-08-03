package com.mm.front;

import com.mm.connector.MysqlConnector;
import com.mm.dao.BookDao;
import com.mm.dao.BookDaoImpl;
import com.mm.dao.CustomerDao;
import com.mm.dao.CustomerDaoImpl;
import com.mm.entity.Customer;

import java.sql.SQLException;

/**
 * Created by machu on 2017-04-23.
 */
public class Main {

    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        CustomerDao customerDao = new CustomerDaoImpl();
        try{
            System.out.println(bookDao.getBooks());
        } catch (SQLException e){
            e.printStackTrace();
        }
        Customer customer = new Customer(2,"Michal", "KKKJJJ");
//        Customer customer2 = new Customer("Patrycja", "Kalala");
        try {
            customerDao.edit(customer);
//            customerDao.add(customer2);
        }catch (SQLException e){
            e.printStackTrace();
        }
//        try {
//            customerDao.add(customer);
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

        MysqlConnector conn = MysqlConnector.getInstance();
        conn.disconnect();


    }
}
