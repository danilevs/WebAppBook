package com.example.WebAppBook.core.book.web;

import com.example.WebAppBook.core.book.Book;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.ArrayList;
public class BookView {

    private long id;

    private String name;

    private String author;


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
