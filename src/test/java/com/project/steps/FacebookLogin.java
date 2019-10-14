package com.project.steps;

import com.project.cucumber.ScenarioContext;
import cucumber.api.Scenario;
//import cucumber.api.java.en.Given;
import cucumber.java8.En;

public class FacebookLogin {

    public FacebookLogin(ScenarioContext scenarioContext){


        Given("^The Facebook Page Is Active$", () -> {
            super.setup();
            scenarioContext.setHomePage(new HomePage(scenarioContext.getDriver()));
        });

    }
}
