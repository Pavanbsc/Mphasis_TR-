package com.mphasis.firstspringapp.service;

public class EmailService {

    private MailServerConfig config;

    public EmailService(MailServerConfig config) {
        this.config = config;
    }

    public void sendMail() {
        System.out.println("Sending email using IP: " + config.getIp());
    }
}