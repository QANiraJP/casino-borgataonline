package com.borgataonline.casino.steps;

import com.borgataonline.casino.pages.Homepage;
import com.borgataonline.casino.pages.RegistrationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new Homepage().clickOnRegisterButton();
    }
    @Then("^Verify continue button$")
    public void verifyContinueButton() {

        Assert.assertEquals("Not on Registration Page","CONTINUE", new RegistrationPage().verifyContinueButoon());

    }
}
