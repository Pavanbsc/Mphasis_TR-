package com.mphasis.firstspringapp.service;

import java.util.List;

public class Library {
    private String libraryName;
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void display() {
        System.out.println("Library: " + libraryName);
        books.forEach(System.out::println);
    }
}