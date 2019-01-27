package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeSignInPage {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(how = How.CSS, using = "div.alert.alert-danger")
    private WebElement informationAboutNotLoggedIn;

    public AutomationPracticeSignInPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void typeInEmailField(String loginEmail) {
        emailField.sendKeys(loginEmail);
    }

    public void typePasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInButtonInAlreadyRegisteredBox() {
        signInButton.click();
    }

    public boolean isInformationAboutNotLoggedInVisible() {
        return informationAboutNotLoggedIn.isDisplayed();
    }
}
