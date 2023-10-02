package vmavropo.stepdefs;

import com.vmavropo.InvalidAuth;
import com.vmavropo.ValidAuth;
import com.vmavropo.utils.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BaseStepDefs {

    Test test;

    ValidAuth validAuth;

    InvalidAuth invalidAuth;

    public BaseStepDefs(Test test) {
        this.test = test;
        validAuth = new ValidAuth(test);
        invalidAuth = new InvalidAuth(test);
    }

    @When("^the user logs into (.+) with (.+) capabilities$")
    public void theUserLogsIntoWithCapabilities(String app, String userRole) {
        test.webDriverFactory()
                .openApplication(app);
        validAuth.login(userRole);
    }

    @Given("^the user tries to login into (.+) with (.+) capabilities$")
    public void theUserTriesToLoginIntoWithInvalidCapabilities(String app, String userRole) {
        test.webDriverFactory().openApplication(app);
        invalidAuth.login(userRole);
    }
}
