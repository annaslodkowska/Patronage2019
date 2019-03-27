package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AutomationPracticeProductPage extends BasePage {

    @FindBy(how = How.ID, using = "selectProductSort")
    private WebElement sortBy;

    public AutomationPracticeProductPage(WebDriver driver) {
        super(driver);
    }
    public void chooseValueInSortBy(String textToChoose) {

        chooseValueInSelectElement(sortBy, textToChoose);
    }
}
