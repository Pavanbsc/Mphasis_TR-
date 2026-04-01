package com.mphasis.firstspringapp.service;

public class Customer {
    private String name;
    private String membershipType;

    public void setName(String name) {
        this.name = name;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String toString() {
        return name + " (" + membershipType + ")";
    }
}
