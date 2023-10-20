package com.netcompany;

import com.vmavropo.utils.Test;

public class UserFactory {

    Test test;

    public UserFactory(Test test) {
        this.test = test;
    }


    public User createUser() {
        return new UserBuilder()
                .withUsername("user123")
                .withEmail("user123@example.com")
                .withAccountType("Standard")
                .build();

    }
}
