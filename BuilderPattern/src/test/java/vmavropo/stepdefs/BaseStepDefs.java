package vmavropo.stepdefs;

import com.netcompany.User;
import com.netcompany.UserBuilder;
import com.netcompany.UserFactory;
import com.vmavropo.utils.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class BaseStepDefs {

    Test test;

    UserFactory userFactory;

    User user;


    public BaseStepDefs(Test test) {
        this.test = test;
        userFactory = new UserFactory(test);
    }

    @Given("^a user has been created$")
    public void aUserHasBeenCreated() {
        user = userFactory.createUser();
    }


}
