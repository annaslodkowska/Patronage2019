package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeMainPage {
    private static String AUTOMATION_PRACTICE_URL = "http://automationpractice.com";
    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement signInInNavigationBar;

    @FindBy(how = How.CLASS_NAME, using = "logout")
    private WebElement logoutButton;

    @FindBy(how = How.ID, using = "newsletter-input")
    private WebElement newsletterInput;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    private WebElement informationAboutError;

    @FindBy(how = How.NAME, using = "submitNewsletter")
    private WebElement submitNewsletterButton;

    public AutomationPracticeMainPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPracticePage() {
        driver.get(AUTOMATION_PRACTICE_URL);
    }

    public void clickSignInInNavigationBar() {
        signInInNavigationBar.click();
    }

    public boolean isSignOutButtonVisible() {
        return logoutButton.isDisplayed();
    }
    public boolean isSignInButtonVisible() {
        return signInInNavigationBar.isDisplayed();
    }

    public void enterEmailIntoNewsletter(String emailAddress, boolean pressEnter) {
        newsletterInput.sendKeys(emailAddress);
        if (pressEnter == true) {
            newsletterInput.sendKeys(Keys.ENTER);
        }
    }
    public boolean isErrorVisible() {
        return informationAboutError.isDisplayed();
    }
    public void clickSubmitNewsletter(){
        submitNewsletterButton.click();
    }

}
