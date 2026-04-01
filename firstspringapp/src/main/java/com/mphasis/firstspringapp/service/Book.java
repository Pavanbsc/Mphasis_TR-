package com.mphasis.firstspringapp.service;

public class Book {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}