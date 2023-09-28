package vmavropo.stepdefs;

import com.vmavropo.Auth;
import com.vmavropo.utils.Test;
import io.cucumber.java.en.When;

public class BaseStepDefs {

    Test test;

    Auth auth;

    public BaseStepDefs(Test test) {
        this.test = test;
        auth = new Auth(test);
    }

    @When("^the user logs into (.+) with (.+) capabilities$")
    public void theUserLogsIntoWithCapabilities(String app, String userRole) {
        test.webDriverFactory()
                .openApplication(app);
        auth.login(userRole);
    }

}
