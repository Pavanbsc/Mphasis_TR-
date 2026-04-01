package com.mphasis.firstspringapp.service;

public class OrderService {

    private EmailService emailService;

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully");
        emailService.sendMail();
    }
}