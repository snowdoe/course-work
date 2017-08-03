package com.mm.entity;

/**
 * Created by machu on 2017-04-22.
 */
public class Customer {

    private int primaryKey;
    private String name;
    private String surname;

    public Customer(int primaryKey, String name, String surname) {
        this.primaryKey = primaryKey;
        this.name = name;
        this.surname = surname;
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "primaryKey=" + primaryKey +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
