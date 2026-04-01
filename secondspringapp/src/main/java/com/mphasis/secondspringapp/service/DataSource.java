package com.mphasis.secondspringapp.service;

public class DataSource {

    private String url;
    private String username;

    public DataSource(String url, String username) {
        this.url = url;
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }
}