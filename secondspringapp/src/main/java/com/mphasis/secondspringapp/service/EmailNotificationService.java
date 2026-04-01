package com.mphasis.secondspringapp.service;

import org.springframework.stereotype.Component;

@Component("emailNotificationService")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}

