package stepDefination;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.SplOffer;

public class SplOfferPage extends CommonFunctions {
    CommonFunctions commonFunctions = new CommonFunctions();
    HomePage homePage = new HomePage(driver);
    SplOffer splOffer = new SplOffer(driver);

    @Given("I am on homepage {string} with title as {string}")
    public void openHomePage(String url, String expectedHomePageTitle) {
        driver.get(url);
        commonFunctions.acceptCookies();
        String actualHomepageTitle = driver.getTitle();
        Assert.assertEquals(expectedHomePageTitle, actualHomepageTitle);
    }

    @When("I click the more option button")
    public void clickMoreButton() {
        homePage.clickMenuBtn();
    }

    @When("I click the spl offer icon")
    public void clickSplOfferIcon() {
        homePage.clickSplOfferIcon();

    }

    @Then("I should be on the spl offer page with title as {string}")
    public void splOfferPage(String expectedSplOfferPageTitle) {
        String actualSplOfferPageTitle = driver.getTitle();
        Assert.assertEquals(expectedSplOfferPageTitle, actualSplOfferPageTitle);

    }

    @When("I click the language icon")
    public void clickLanguageIcon() {
        splOffer.clickLanguageIcon();
    }

    @When("I click Schweiz icon")
    public void clickSchweizIcon() {
        splOffer.clickSchweiz();
    }

    @When("I click France icon")
    public void clickFranceIcon() {
        splOffer.clickFrance();
    }

    @When("I click Danmark icon")
    public void clickDenmarkIcon() {
        splOffer.clickDenmark();
    }

    @Then("The page should be changed into that particular country language with title as {string}")
    public void languageChange(String expectedNewTitle) {

        String actualNewTitle = driver.getTitle();
        Assert.assertEquals(expectedNewTitle, actualNewTitle);
    }


}
