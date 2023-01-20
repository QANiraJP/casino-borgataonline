package com.borgataonline.casino.pages;

import com.borgataonline.casino.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());
    @CacheLookup
   @FindBy(id = "continue")
    WebElement continueButton;

    public String verifyContinueButoon(){
        log.info("Verify Continue Button");
       return getTextFromElement(continueButton);

    }
}
