package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SplOffer {
    public SplOffer(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "lang")
    public WebElement languageIcon;

    @FindBy(xpath = "//a[text()=\"Danmark\"]")
    public WebElement denmark;

    @FindBy(xpath = "//a[text()=\"Schweiz (DE)\"]")
    public WebElement schweiz;

    @FindBy(xpath = "//a[text()=\"France\"]")
    public WebElement france;

    public void clickLanguageIcon()
    {
        languageIcon.click();
    }
    public void clickDenmark()
    {
        denmark.click();
    }
    public void clickSchweiz()
    {
        schweiz.click();
    }
    public void clickFrance()
    {
        france.click();
    }

}
