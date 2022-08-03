package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "navbarDropdownMenu")
    public WebElement menuBtn;
    @FindBy(xpath = "//a[text()=\"Special offers\"]")
    public WebElement splOfferIcon;


    public void clickMenuBtn()
    {
        menuBtn.click();
    }
    public void clickSplOfferIcon()
    {
        splOfferIcon.click();
    }

}
