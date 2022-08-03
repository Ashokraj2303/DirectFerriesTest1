package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class DealFinderPage {
    public DealFinderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@for=\"journey_round_trip\"]")
    public WebElement roundTripIcon;

    @FindBy(xpath = "//label[@for=\"journey_oneway\"]")
    public WebElement oneWayIcon;
    @FindBy(xpath = "//label[@class=\"journey_route\"]")
    public WebElement searchBar;

    @FindBy(xpath = "//li[@data-routename=\"Dover - Calais\"]")
    public WebElement doverToCalaisRout;
    @FindBy(xpath = "//section[@class=\"journey_timing timing_outbound hide_until_times\"]")
    public WebElement departureDateTimeIcon;
    @FindBy(xpath = "//section[@class=\"journey_timing timing_return round_trip hide_until_times\"]")
    public WebElement returnDateTimeIcon;
    @FindBy(xpath = "//div[@aria-label=\"Friday, August 12\"]/div[text()=\"12\"]")
    public WebElement departureDate;
    @FindBy(id = "deafinder-submit")
    public WebElement confirmBtn;
    @FindBy(xpath = "//div[@class=\"mbsc-scrollview-scroll mbsc-ltr\"]/div[text()=\"10\"]")
    public WebElement departureTime;
    @FindBy(xpath = "//span[text()=\"Adults\"]")
    public WebElement adultsOption;
    @FindBy(xpath = "//label[text()=\"Adults (18+)\"]/span[@class=\"decrement-pax\"]")
    public WebElement adultPassengerReducingIcon;
    @FindBy(xpath = "//label[text()=\"Adults (18+)\"]/span[@class=\"increment-pax\"]")
    public WebElement adultPassengerIncreaseIcon;
    @FindBy(xpath = "//label[text()=\"Children (0-17)\"]/span[@class=\"increment-pax\"]")
    public WebElement childPassengerIncreaseIcon;
    @FindBy(xpath = "//label[text()=\"Children (0-17)\"]/span[@class=\"decrement-pax\"]")
    public WebElement childPassengerReduceIcon;
    @FindBy(xpath = "//button[text()=\"Done\"]")
    public WebElement doneBtn;
    @FindBy(xpath = "//a[@class=\"journey_details vehicle trip_outbound both_ways\"]")
    public WebElement vehicleOpt;
    @FindBy(xpath = "//label[text()=\"Motorcycle\"]")
    public WebElement motorcycleOpt;
    @FindBy(xpath = "//label[text()=\"Car\"]")
    public WebElement carOpt;
    @FindBy(xpath = "//label[text()=\"Honda\"]")
    public WebElement hondaBrandCar;
    @FindBy(id = "vehicle_make_outbound")
    public WebElement vehicleMake;
    @FindBy(xpath = "//label[text()=\"Civic\"]")
    public WebElement civicHondaModel;
    @FindBy(xpath = "//label[text()=\"No\"]")
    public WebElement noForLuggageQuestion;
    @FindBy(xpath = "//label[text()=\"No Caravan/Trailer\"]")
    public WebElement noForCaravan;
    @FindBy(id = "vehicle_model_outbound")
    public WebElement vehicleModel;
    @FindBy(id = "deafinder-submit")
    public WebElement searchBtn;
    @FindBy(xpath = "//label[text()=\"Bicycle\"]")
    public WebElement bicycle;

    public void selectBycycle() {
        bicycle.click();
    }

    public void selectRoundTrip() {
        roundTripIcon.click();
    }

    public void selectOneWayTrip() {
        oneWayIcon.click();
    }



    public void selectDepartureDateTimeOpt() {
        departureDateTimeIcon.click();
    }



    public void clickConfirmBtn() {
        confirmBtn.click();
    }

    public void selectAdultOpt() {
        adultsOption.click();
    }



    public void clickDoneBtn() {
        doneBtn.click();
    }

    public void selectVehicleOpt() {
        vehicleOpt.click();

    }

    public void selectMotorcycle() {
        motorcycleOpt.click();
    }

    public void selectCar() {
        carOpt.click();
    }

    public void selectHondaCar() {
        hondaBrandCar.click();
    }

    public void selectCivicHondaModel() {
        civicHondaModel.click();
    }

    public void setNoForLuggageQuestion() {
        noForLuggageQuestion.click();
    }

    public void setNoForCaravan() {
        noForCaravan.click();
    }

    public void clickSearchIcon() {
        searchBtn.click();
    }

}
