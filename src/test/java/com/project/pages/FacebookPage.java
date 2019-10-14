package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookPage {

    @FindBy(how = How.XPATH, using = "//input[@name=\"email\"]")
    private WebElement emailInput;

    @FindBy(how = How.XPATH, using = "//input[@name=\"pass\"]")
    private WebElement passwordInput;

    public WebElement getEmailInput(){return emailInput;}

    public WebElement getPasswordInput(){return passwordInput;}
}
