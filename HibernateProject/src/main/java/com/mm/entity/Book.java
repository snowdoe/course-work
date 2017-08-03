package com.mm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by machu on 2017-06-11.
 */
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private Long title;

    //TODO: jsonignore
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    }
