package com.virgingrames.pages;

import com.virgingrames.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to Virgin Games')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"styledApp\"]/header/span/a[2]")
    WebElement joinNow;

    public void acceptCookies() {
        log.info("Click on accept cookies" + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }

    public String getWelcomeToStoreText() {
        log.info("Get Welcome Virginegames to store text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnJoinNow(){
        log.info("Click on Join Now" +joinNow.toString());
        clickOnElement(joinNow);
    }
}