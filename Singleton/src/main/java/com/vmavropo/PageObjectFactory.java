package com.vmavropo;

import com.vmavropo.utils.Test;

import java.util.Objects;

public class PageObjectFactory {


    Test test;

    protected Auth auth;


    public PageObjectFactory(Test test){
        auth(test);
    }

    public Auth auth(Test test) {
        return Objects.requireNonNullElseGet(auth, () -> auth = new Auth(test));
    }
}
