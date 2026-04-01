package com.mphasis.firstspringapp.service;

public class GreetService {

    private String msg;

    public GreetService() {
        System.out.println("GreetService constructor called");
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void init() {
        System.out.println("GreetService initialized");
    }

    public void greet() {
        System.out.println(msg);
    }

    public void destroy() {
        System.out.println("GreetService destroyed");
    }
}