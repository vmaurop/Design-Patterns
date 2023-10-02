package vmavropo.stepdefs;

import com.vmavropo.PageObjectFactory;
import com.vmavropo.utils.Test;
import io.cucumber.java.en.When;


public class BaseStepDefs extends PageObjectFactory {

    Test test;


    public BaseStepDefs(Test test) {
        super(test);
        this.test = test;
    }

    @When("^the user logs into (.+) with (.+) capabilities$")
    public void theUserLogsIntoWithCapabilities(String app, String userRole) {
        test.webDriverFactory()
                .openApplication(app);
        auth.login(userRole);
    }

}
