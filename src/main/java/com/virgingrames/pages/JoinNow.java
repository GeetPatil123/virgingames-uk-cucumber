package com.virgingrames.pages;

import com.virgingrames.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class JoinNow extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Pardon Our Interruption')]")
    WebElement pardonText;

    public String verifyPardonText() {
        log.info("Pardon Our Interruption" + pardonText.toString());
        return getTextFromElement(pardonText);
    }
}
