package com.example.WebAppBook.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name, author;

    public BookModel(){}

    public BookModel(String name, String author){
        this.name = name;
        this.author=author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
