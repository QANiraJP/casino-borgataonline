package com.borgataonline.casino.pages;

import com.borgataonline.casino.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement registerLink;

//    public Homepage() {
//        PageFactory.initElements(driver, this);
//    }
    public void clickOnRegisterButton(){
        log.info("Clicking on Register Button");
        clickOnElement(registerLink);

    }


}
