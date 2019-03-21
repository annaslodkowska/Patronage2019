package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationPracticeSignInPage extends BasePage {

    @FindBy(how = How.ID, using = "email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement signInButton;

    public AutomationPracticeSignInPage(final WebDriver driver) {
       super(driver);
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


}
