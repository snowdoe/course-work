package com.mm.entity;

import java.util.Date;

/**
 * Created by machu on 2017-04-22.
 */
public class Hire {
    private int primaryKey;
    private Date dateSince;
    private Date dateGiveBack;

    private int bookId;
    private int customerId;

    public Hire(int primaryKey, Date dateSince, Date dateGiveBack, int bookId, int customerId) {
        this.primaryKey = primaryKey;
        this.dateSince = dateSince;
        this.dateGiveBack = dateGiveBack;
        this.bookId = bookId;
        this.customerId = customerId;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public Date getDateSince() {
        return dateSince;
    }

    public Date getDateGiveBack() {
        return dateGiveBack;
    }

    public int getBookId() {
        return bookId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Hire{" +
                "primaryKey=" + primaryKey +
                ", dateSince=" + dateSince +
                ", dateGiveBack=" + dateGiveBack +
                ", bookId=" + bookId +
                ", customerId=" + customerId +
                '}';
    }
}
