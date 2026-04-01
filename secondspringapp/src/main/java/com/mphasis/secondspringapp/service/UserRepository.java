package com.mphasis.secondspringapp.service;

public class UserRepository {

    private final DataSource dataSource;

    public UserRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // ✅ Method name must match App.java
    public void printDbInfo() {
        System.out.println("DB URL  : " + dataSource.getUrl());
        System.out.println("DB User : " + dataSource.getUsername());
    }
}