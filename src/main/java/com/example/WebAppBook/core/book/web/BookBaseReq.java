package com.example.WebAppBook.core.book.web;

import com.example.WebAppBook.base.BaseRequest;


public class BookBaseReq extends BaseRequest {

    private String name;
    private String author;

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
