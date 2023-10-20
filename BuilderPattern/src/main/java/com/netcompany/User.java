package com.netcompany;

public class User {

    private String username;
    private String email;
    private String accountType;


    public User(String username, String email, String accountType) {
        this.username = username;
        this.email = email;
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountType() {
        return accountType;
    }
}
