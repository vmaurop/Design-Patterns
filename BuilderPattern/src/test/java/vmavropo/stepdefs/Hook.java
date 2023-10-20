package vmavropo.stepdefs;

import com.netcompany.User;
import com.netcompany.UserFactory;
import com.vmavropo.utils.Test;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

    Test test;

    User user;

    UserFactory userFactory;
    public Hook(Test test) {
        this.test = test;
        userFactory = new UserFactory(test);
    }


    @Before(value = "@UI", order = 1)
    public void beforeUITest() {
        test.webDriverFactory().openBrowser();
        test.webDriverFactory().getDriver().manage().window().maximize();
    }

    @Before(value = "@API", order = 1)
    public void beforeTest(Scenario scenario) {
        test.context().setScenario(scenario);
    }

    @After(value = "@UI", order = 1)
    public void afterTest(Scenario scenario) {
        test.webDriverFactory().closeBrowser(scenario);
    }

}
