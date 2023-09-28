package com.vmavropo;

import com.vmavropo.utils.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auth {

    Test test;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "kc-login")
    private WebElement loginButton;

    public Auth(Test test) {
        this.test = test;
        PageFactory.initElements(test.webDriverFactory().getDriver(), this);
    }


    public void login(String userRole) {
        test.waitFor().elementToBeDisplayed(usernameField);
        test.element().input().setText(usernameField, test.envDataConfig().getUsername(userRole));
        test.element().input().setText(passwordField, test.envDataConfig().getPassword(userRole));
        test.element().button().click(loginButton);
    }

}
