package com.virgingrames.steps;

import com.virgingrames.pages.Homepage;
import com.virgingrames.pages.JoinNow;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new Homepage().acceptCookies();
    }

    @Then("^I am on the Homepage$")
    public void iAmOnTheHomepage() {
    }

    @And("^I verify Welcome to Virgin Games text is displayed$")
    public void iVerifyWelcomeToVirginGamesTextIsDisplayed() {
        String expectedText = "Welcome to Virgin Games";
        Assert.assertEquals("Welcome to Virgin Games is not displayed", expectedText, new Homepage().getWelcomeToStoreText());
    }

    @Then("^I click on join now$")
    public void iClickOnJoinNow() {
        new Homepage().clickOnJoinNow();
    }

    @And("^I am Verifying Pardon Our Interruption$")
    public void iAmVerifyingPardonOurInterruption() {
        String expectedText = "Pardon Our Interruption";
        Assert.assertEquals("Pardon Our Interruption", expectedText, new JoinNow().verifyPardonText());
    }
}
