package com.vmavropo.utils.factory;

import com.vmavropo.utils.Test;
import com.vmavropo.utils.common.BrowserControls;

import java.util.Objects;

public class PageObjectFactory {

    Test test;

    BrowserControls browser;


    public PageObjectFactory(Test test) {
        this.test = test;
    }

    public BrowserControls browser() {
        return Objects.requireNonNullElseGet(browser, () -> browser = new BrowserControls(test));
    }


}
