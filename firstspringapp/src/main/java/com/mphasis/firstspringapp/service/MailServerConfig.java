package com.mphasis.firstspringapp.service;

public class MailServerConfig {

    private String ip;
    private String login;
    private String token;

    public MailServerConfig(String ip, String login, String token) {
        this.ip = ip;
        this.login = login;
        this.token = token;
    }

    public String getIp() {
        return ip;
    }

    public String getLogin() {
        return login;
    }
}
