package com.mphasis.firstspringapp.service;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSService {

    public void sendSMS() {   // ✅ must be public
        System.out.println("SMS Sent.....");
    }
}