package stepDefination;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.DealFinderPage;

public class DealFinder extends CommonFunctions {
    CommonFunctions commonFunctions = new CommonFunctions();
    DealFinderPage dealFinderPage = new DealFinderPage(driver);


    @When("I click one way icon on the deal finder and click one of the popular rout")
    public void selectingOnewayAndRout() {
        waitForTime(5);
        dealFinderPage.selectOneWayTrip();
        driver.findElement(By.xpath("//li[@data-routename=\"Dover - Calais\"]")).click();

    }

    @When("I select Departure date on 12 august and time 10")
    public void selectDateTimeOption() {
        waitForTime(5);
        dealFinderPage.selectDepartureDateTimeOpt();
        driver.findElement(By.xpath("//div[@aria-label=\"Friday, August 12\"]/div[text()=\"12\"]")).click();
        dealFinderPage.clickConfirmBtn();
        driver.findElement(By.xpath("//div[@class=\"mbsc-scrollview-scroll mbsc-ltr\"]/div[text()=\"10\"]")).click();
        dealFinderPage.clickConfirmBtn();

    }

    @When("I select number of adult passenger into one and click done btn")
    public void selectingNumberOfAdultPassengers() {
        waitForTime(5);
        dealFinderPage.selectAdultOpt();
        dealFinderPage.adultPassengerReducingIcon.click();
        dealFinderPage.clickDoneBtn();
    }

    @When("I vehicle icon and click motorcycle option")
    public void selectingVehicleType() {
        waitForTime(5);
        dealFinderPage.selectVehicleOpt();
        dealFinderPage.selectMotorcycle();
    }

    @When("I enter {string} on the vehicle make and {string} on the vehicle model")
    public void enteringVehicleDetails(String vehicleMake, String vehicleModel) {
        waitForTime(5);
        dealFinderPage.vehicleMake.sendKeys(vehicleMake);
        dealFinderPage.vehicleModel.sendKeys(vehicleModel);
        dealFinderPage.clickDoneBtn();
    }

    @When("I click the search btn")

    public void clickSearchBtn() {
        waitForTime(5);
        dealFinderPage.clickSearchIcon();
    }

    @Then("I should be on the page with Departure details {string} and route {string}")
    public void gettingSearchResult(String expectedDepartureDetails, String expectedRoute) {
        waitForTime(5);
        String actualDepartureDetails = driver.findElement(By.id("lnkOutDate")).getText();
        Assert.assertEquals(expectedDepartureDetails, actualDepartureDetails);
        String actualRout = driver.findElement(By.id("lnkRoute")).getText();
        Assert.assertEquals(expectedRoute, actualRout);

    }


    @When("I click round trip and enter {string} in the search bar")
    public void selectRoundTripAndRout(String place) {
        dealFinderPage.selectRoundTrip();
        dealFinderPage.searchBar.sendKeys(place);


    }

    @When("I click Dover - Dunkirk rout")
    public void selectDoverDunkirtRout() {
        driver.findElement(By.xpath("//li[@data-routename=\"Dover - Dunkirk\"]")).click();
    }

    @When("I select number of adult passenger into three and click done btn")
    public void selectNoOfPassengers() {
        dealFinderPage.selectAdultOpt();
        dealFinderPage.adultPassengerIncreaseIcon.click();
        dealFinderPage.clickDoneBtn();

    }

    @When("I select Departure date on 12 august and return  date on 19 august")
    public void selectDepartureAndLeavingDetails() {
        waitForTime(5);
        dealFinderPage.selectDepartureDateTimeOpt();
        driver.findElement(By.xpath("//div[@aria-label=\"Friday, August 12\"]/div[text()=\"12\"]")).click();
        driver.findElement(By.xpath("//div[@aria-label=\"Friday, August 19\"]/div[text()=\"19\"]")).click();
        dealFinderPage.clickConfirmBtn();

        dealFinderPage.clickConfirmBtn();
    }

    @When("I vehicle icon and click car option")
    public void clickVehicleAndSelectCar() {
        dealFinderPage.selectVehicleOpt();
        dealFinderPage.selectCar();

    }

    @When("I select honda brand and select civic model")
    public void selectCarBrandAndModel() {
        dealFinderPage.selectHondaCar();
        dealFinderPage.selectCivicHondaModel();

    }

    @When("I select no to luggage and Caravan")
    public void selectNoToLuggageAndCaravan() {
        dealFinderPage.setNoForLuggageQuestion();
        dealFinderPage.setNoForCaravan();
        dealFinderPage.clickDoneBtn();
    }

    @Then("I should be on the page with Departure details {string}, return deatils {string}and route {string}")
    public void gettingSearchResult(String expectedDepartureDetails, String expectedReturnDetails, String expectedRoute) {
        waitForTime(5);
        String actualDepartureDetails = driver.findElement(By.id("lnkOutDate")).getText();
        Assert.assertEquals(expectedDepartureDetails, actualDepartureDetails);
        String actualReturnDetails = driver.findElement(By.id("lnkRetDate")).getText();
        Assert.assertEquals(expectedReturnDetails, actualReturnDetails);
        String actualRout = driver.findElement(By.id("lnkRoute")).getText();
        Assert.assertEquals(expectedRoute, actualRout);
    }

@Then("I should get {string} mgs")
    public void invalidMgs(String expectedInvalidSearchMgs)
{ waitForTime(5);
    String actualInvalidSearchMgs=driver.findElement(By.xpath("//aside[@class=\"route_list\"]/h5[text()=\"No Routes Found\"]")).getText();
    Assert.assertEquals(expectedInvalidSearchMgs,actualInvalidSearchMgs);
}
@When("I select number of adult passenger into three and child one")
    public void addingThreeAdultAndOneChild()
{dealFinderPage.selectAdultOpt();
    dealFinderPage.adultPassengerIncreaseIcon.click();
    dealFinderPage.childPassengerIncreaseIcon.click();

}
@When("I add child age as 6 and click done")
    public void addingChildAge()
{
    driver.findElement(By.id("child-1")).click();
    driver.findElement(By.xpath("//select[@class=\"passenger_age\"]/option[text()=\"6\"]")).click();
    dealFinderPage.clickDoneBtn();
}
@When("I vehicle icon and click Bicycle option")
    public void selectingBicyle()
{
dealFinderPage.selectVehicleOpt();
dealFinderPage.selectBycycle();
}
@Then("I should be on the page with {string} mgs")
    public void notEnoughVehicleMgs(String expectedmgs)

{
String actualmgs= driver.findElement(By.xpath("//span[text()=\"The maximum number of passengers allowed with this vehicle type is 1 \"]")).getText();
Assert.assertEquals(expectedmgs,actualmgs);
}
@When("I click one way icon on the deal finder and enter {string} in the search bar")
    public void invalidSearch(String invalidSearchTerm)
{dealFinderPage.selectOneWayTrip();
    dealFinderPage.searchBar.sendKeys(invalidSearchTerm);

    dealFinderPage.clickSearchIcon();



}
@Then("I should get invalid routes mgs {string}")
    public void invalidSearchMgs(String expectedInvalidMgs)
{waitForTime(5);
    String actualInvalidMgs= driver.findElement(By.xpath("//h5[text()=\"No Routes Found\"]")).getText();
    Assert.assertEquals(expectedInvalidMgs,actualInvalidMgs);

}
}
