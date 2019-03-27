package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void chooseValueInSelectElement(WebElement selectElement, String textToChoose){
        Select tmpSelect = new Select(selectElement);
        tmpSelect.selectByVisibleText(textToChoose);
    }

}
