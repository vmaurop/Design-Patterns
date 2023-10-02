package com.vmavropo;

import com.vmavropo.utils.Test;
import com.vmavropo.utils.common.WaitFor;

public class InvalidAuth implements Auth {

    Test test;

    WaitFor wait;


    public InvalidAuth(Test test) {
        this.test = test;
        wait = new WaitFor(test);
    }

    public void login(String userRole) {
        test.waitFor().elementToBeDisplayed(AuthElements.USERNAME);
        test.element().input().setText(AuthElements.USERNAME, test.envDataConfig().getUsername(userRole));
        test.element().input().setText(AuthElements.PASSWORD, test.envDataConfig().getPassword(userRole));
        test.element().button().click(AuthElements.SIGN_IN_BUTTON);
    }
}
