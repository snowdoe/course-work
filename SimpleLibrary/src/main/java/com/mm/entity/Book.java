package com.mm.entity;

/**
 * Created by machu on 2017-04-22.
 */
public class Book {

    private int primaryKey;
    private String title;
    private String author;

    public Book(int primaryKey, String title, String author) {
        this.primaryKey = primaryKey;
        this.title = title;
        this.author = author;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "primaryKey=" + primaryKey +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = primaryKey;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
