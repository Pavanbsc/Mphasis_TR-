package com.mphasis.firstspringapp.service;

import java.util.List;

public class ShoppingCart {
    private Customer customer;
    private List<Product> products;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void display() {
        System.out.println(customer);
        products.forEach(System.out::println);
    }
}