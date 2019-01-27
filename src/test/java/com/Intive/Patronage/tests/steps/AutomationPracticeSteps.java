package com.Intive.Patronage.tests.steps;
import com.Intive.Patronage.tests.pages.AutomationPracticeMainPage;
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


    @Given("^I am on automationpractice page")
    public void iAmOnAutomationPracticePage() {
        automationPracticeMainPage.openAutomationPracticePage();
    }

    @When("^I click on Sign In button in navigation bar")
    public void iClickOnSignInButtonInNavigationar(){
        automationPracticeMainPage.clickSignInInNavigationBar();
    }

    @And("^I fill email address field in Alredy Registered box with \"([^\"]*)\"$")
    public void iFillEmailAddressFieldInAlreadyegisteredBoxWith(String login) {
        automationPracticeSignInPage.typeInEmailField(login);
    }

    @And("^I fill password field in Alredy Registered box with \"([^\"]*)\"$")
    public void iFillPasswordFieldInAlreadyegisteredBoxWith(String password) {
        automationPracticeSignInPage.typePasswordField(password);
    }

    @And("^I click Sign In button in Alredy Registered box")
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
    @Then("^I see information about inproper email address or password")
    public void iSeeInformationAboutInproperEmailAddressOrPassword() {
        assertThat("user is not logged in", automationPracticeSignInPage.isInformationAboutNotLoggedInVisible() == true);
    }
}
