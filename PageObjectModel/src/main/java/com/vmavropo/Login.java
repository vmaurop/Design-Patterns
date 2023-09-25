package com.vmavropo;

import com.vmavropo.utils.Test;
import com.vmavropo.utils.common.WaitFor;

public class Login {

    Test test;

    WaitFor wait;


    public Login(Test test) {
        this.test = test;
        wait = new WaitFor(test);
    }

    public void login(String userRole) {
        test.waitFor().elementToBeDisplayed(LoginElements.USERNAME);
        test.element().input().setText(LoginElements.USERNAME, test.envDataConfig().getUsername(userRole));
        test.element().input().setText(LoginElements.PASSWORD, test.envDataConfig().getPassword(userRole));
        test.element().button().click(LoginElements.SIGN_IN_BUTTON);
    }

}
