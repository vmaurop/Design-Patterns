package com.netcompany;

public class UserBuilder {

    private String username;
    private String email;
    private String accountType;

    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public User build() {
        return new User(username, email, accountType);
    }
}