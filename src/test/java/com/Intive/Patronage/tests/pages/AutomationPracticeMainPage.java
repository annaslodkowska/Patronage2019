package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationPracticeMainPage extends BasePage {
    private static String AUTOMATION_PRACTICE_URL = "http://automationpractice.com";

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

   // @FindBy(how = How.XPATH, using = "//a[@title='Dresses']")
    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    private WebElement dressesOnTopMenu;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div[2]/ul/p/img")
    private WebElement loaderGif;

    public AutomationPracticeMainPage(final WebDriver driver) {
        super(driver);
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
    public  void clickDressesOnTopMenu() {
        dressesOnTopMenu.click();
    }
    public boolean isLoaderDisplayed(){
        return loaderGif.isDisplayed();
    }
}
