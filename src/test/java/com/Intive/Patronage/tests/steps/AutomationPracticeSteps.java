package com.Intive.Patronage.tests.steps;
import com.Intive.Patronage.tests.pages.AutomationPracticeMainPage;
import com.Intive.Patronage.tests.pages.AutomationPracticeProductPage;
import com.Intive.Patronage.tests.pages.AutomationPracticeSignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.Intive.Patronage.tests.DriverFactory;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutomationPracticeSteps extends DriverFactory {

    AutomationPracticeMainPage automationPracticeMainPage = new AutomationPracticeMainPage(driver);
    AutomationPracticeSignInPage automationPracticeSignInPage = new AutomationPracticeSignInPage(driver);
    AutomationPracticeProductPage automationPracticeProductPage = new AutomationPracticeProductPage(driver);


    @Given("^I am on automationpractice page")
    public void iAmOnAutomationPracticePage() {
        automationPracticeMainPage.openAutomationPracticePage();
    }

    @When("^I click on Sign In button in navigation bar")
    public void iClickOnSignInButtonInNavigationar(){
        automationPracticeMainPage.clickSignInInNavigationBar();
    }

    @And("^I fill email address field in Already Registered box with \"([^\"]*)\"$")
    public void iFillEmailAddressFieldInAlreadyegisteredBoxWith(String login) {
        automationPracticeSignInPage.typeInEmailField(login);
    }

    @And("^I fill password field in Already Registered box with \"([^\"]*)\"$")
    public void iFillPasswordFieldInAlreadyegisteredBoxWith(String password) {
        automationPracticeSignInPage.typePasswordField(password);
    }

    @And("^I click Sign In button in Already Registered box")
    public void iClickSignInButtonInAlreadyRegisteredBox() {
        automationPracticeSignInPage.clickSignInButtonInAlreadyRegisteredBox();
    }

    @Then("^I am logged in")
    public void iAmLoggedIn() {
        assertThat("user is not logged in", automationPracticeMainPage.isSignOutButtonVisible() == true);
    }

    @Then("^I am not logged in")
    public void iAmNotLoggedIn() {
        assertThat( "user is not logged in", automationPracticeMainPage.isSignInButtonVisible() == true);
    }
    @Then("^Error message is displayed")
    public void errormessageIsDisplayed() {
        assertThat("Error message is not displayed", automationPracticeMainPage.isErrorVisible() == true);
    }

    @When("^I type \"([^\"]*)\" into \"Enter your email\" and confirm by Enter$")
    public void iTypeEmailAddressIntoNewsletterFieldAndPressEnter(String emailAddress) {
        automationPracticeMainPage.enterEmailIntoNewsletter(emailAddress, true);
    }
    @When("^I type \"([^\"]*)\" into \"Enter your email\"$")
    public void iTypeEmailAddressIntoNewsletterField(String emailAddress) {
        automationPracticeMainPage.enterEmailIntoNewsletter(emailAddress, false);
    }
    @Then("^I click next button in \"Enter your email\" section")
    public void iClickNextButtonInEnterYourEmailSection() {
        automationPracticeMainPage.clickSubmitNewsletter();
    }
    // When I click on "Dresses" on top menu//
    @When("^I click on \"Dresses\" on top menu")
    public void iClickDressesOnTopMenu() {
        automationPracticeMainPage.clickDressesOnTopMenu();
    }
    // I choose "<sort method>" in "Sort by" drop-down box//
    @When("^I choose \"([^\"]*)\" in \"Sort by\" drop-down box")
    public void iChooseByTextInSortByDropDownBox(String textToSelect) {
        automationPracticeProductPage.chooseValueInSortBy(textToSelect);
    }
    // Loader is displayed //
    @Then("^Loader is displayed")
    public void loaderIsDisplayed() {
        assertThat("loader should be displayed", automationPracticeMainPage.isLoaderDisplayed() == true);
    }
}
